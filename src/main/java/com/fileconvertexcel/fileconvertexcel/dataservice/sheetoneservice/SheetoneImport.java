package com.fileconvertexcel.fileconvertexcel.dataservice.sheetoneservice;

import com.fileconvertexcel.fileconvertexcel.dataservice.DataImport;
import com.fileconvertexcel.fileconvertexcel.sheetinfo.SheetOne;
import com.fileconvertexcel.fileconvertexcel.sheetmapping.OnesheetMapping;
import jxl.Sheet;
import jxl.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

@Service
@Component
public class SheetoneImport implements DataImport {
    @Autowired
    SheetOnejpa sheetOnejpa;
    @Autowired
    OnesheetMapping onesheetMapping;
    //从配置文件中获取表一的路径
    @Value("${sheetone.filepath}")
    private String filepath;
    public void importDatabase(){

        //将传入的值设置为成员变量;
        List<Object> listObject = this.getObject();
        for(Object obj:listObject){
            SheetOne sheetOneInfo = (SheetOne) obj;
            //System.out.println(sheetOneInfo);
            //利用JPA将实体类对象信息存储到数据库中;
            sheetOnejpa.save(sheetOneInfo);
        }
        System.out.println("数据表一导入完成");
    }

    public List<Object> getObject(){

        //设置键值对，建立excel表中属性 和 实体类的属性 映射关系；
        onesheetMapping.setSheetOneMap();
        //获取当前文件下下时间戳最新的文件（时间戳最新意味着字符串最大）
        File file = new File( this.filepath );
        File[] array = file.listFiles();
        String fileMaxName = array[0].getName();
        String fileName = array[0].getName() ;
        for(int i = 1;i<array.length;i++){
            fileName = array[i].getName();
            if( fileMaxName.compareTo(fileName)<0 ){
                fileMaxName = fileName;
            }
        }
        String filepath = this.filepath + "/" + fileMaxName;
        List<Object> listObject = getAllByExcel(filepath);
        return listObject;
    }

    public List<Object> getAllByExcel( String filepath){
        List<Object> list = new ArrayList<Object>();
        try {
            Workbook rwb = Workbook.getWorkbook(new File(filepath));
            Sheet rs = rwb.getSheet(0);
            int clos = rs.getColumns();// 得到所有的列
            int rows = rs.getRows();// 得到所有的行

            for (int i = 0; i < rows; i++) {
                if(i == 0) {
                    continue;
                }
                // 取得的每一行的所有数据存入listString
                List<String> listString = new ArrayList<String>();
                for (int j = 0; j < clos; j++) {
                    String str = rs.getCell(j, i).getContents();
                    listString.add(str);
                }
                SheetOne sheetInfo = (SheetOne) newObject(listString);
                //以下为数据改变内容，可在此处修改对象的属性，实现指定的功能和相关算法，下面所示为修改回购期限测试算法；
                sheetInfo.setlHgDays();
                sheetInfo.setId( i ) ;
                list.add(sheetInfo);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public Object newObject( List<String> listString ) throws IllegalAccessException {
        Class clazz = SheetOne.class;
        SheetOne sheetOne = null;
        try{
            sheetOne = (SheetOne)clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        for (int i =0 ; i<this.onesheetMapping.getOneMap().size() ; i++) {
            String str = this.onesheetMapping.getOneMap().get(i);//得到每个key多对用value的值
            Field field = null;
            try {
                field = clazz.getDeclaredField( str );
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }
            field.setAccessible(true);
            if (field.getType() == String.class){
                field.set(sheetOne , listString.get(i) );
            }
            if (field.getType() == int.class) {
                field.set(sheetOne , Integer.parseInt(listString.get(i)));
            }
            if (field.getType() == Integer.class) {
                //对特定日期进行更改 (首次结算日 和 到期结算日)；
                if(str ==  "lFirstSettledate" || str == "lExpireSettledate"){
                    String lfStr = listString.get(i);
                    //除去第四个和第七个字符，此处应该严谨；
                    lfStr = lfStr.substring(0,4) + lfStr.substring(5,7) + lfStr.substring(8,10);
                    field.set( sheetOne, Integer.parseInt( lfStr));
                }else{
                    field.set(sheetOne, Integer.parseInt(listString.get(i)));
                }
            }
            if (field.getType() == Double.class){
                field.set(sheetOne , Double.parseDouble(listString.get(i)));
            }
            if (field.getType() == Long.class) {
                field.set(sheetOne, Long.parseLong(listString.get(i)));
            }
        }
        return sheetOne;
    }
}
