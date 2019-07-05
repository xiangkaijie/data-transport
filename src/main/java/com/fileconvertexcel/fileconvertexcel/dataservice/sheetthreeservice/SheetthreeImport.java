package com.fileconvertexcel.fileconvertexcel.dataservice.sheetthreeservice;
import com.fileconvertexcel.fileconvertexcel.sheetinfo.SheetThree;
import com.fileconvertexcel.fileconvertexcel.sheetmapping.OnesheetMapping;
import com.fileconvertexcel.fileconvertexcel.sheetmapping.ThreesheetMapping;
import jxl.Sheet;
import jxl.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

@Service
public class SheetthreeImport {
    @Autowired
    SheetThreejpa sheetThreejpa;
    @Autowired
    ThreesheetMapping threesheetMapping;
    //从配置文件中获取表一的路径
    @Value("${sheetthree.filepath}")
    private String filepath;
    private OnesheetMapping oneSheetMapping;

    public void importDatabase(){

        //将传入的值设置为成员变量;
        List<Object> listObject = this.getObject();
        for(Object obj:listObject){
            SheetThree sheetThreeInfo = (SheetThree) obj;
            //利用JPA将实体类对象信息存储到数据库中;
            sheetThreejpa.save(sheetThreeInfo);
        }
        System.out.println("数据表三导入完成");
    }

    public List<Object> getObject(){

        //设置键值对，建立excel表中属性 和 实体类的属性 映射关系；
        threesheetMapping.setThreeMap();
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
        List<Object> listObject = getAllByExcel( filepath );
        return listObject;
    }

    public List<Object> getAllByExcel(String filepath){
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
                SheetThree sheetInfo = (SheetThree) newObject(listString);
                //以下为数据改变内容，可在此处修改对象的属性，实现指定的功能和相关算法，下面所示为修改回购期限测试算法；
                sheetInfo.setId(i);
                list.add(sheetInfo);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public Object newObject( List<String> listString ) throws IllegalAccessException {
        Class clazz = SheetThree.class;
        SheetThree sheetThree = null;
        try {
            sheetThree = (SheetThree)clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        for (int i =0 ; i<threesheetMapping.getThreeMap().size(); i++) {
            String str = threesheetMapping.getThreeMap().get(i);//得到每个key多对用value的值
            Field field = null;
            try {
                field = clazz.getDeclaredField( str );
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }
            field.setAccessible(true);
            if (field.getType() == String.class){
                field.set(sheetThree , listString.get(i) );
            }
            if (field.getType() == Integer.class) {
                //对特定日期进行更改 (首次结算日 和 到期结算日)；
                if(str ==  "lFirstSettledate" || str == "lExpireSettledate"){
                    String lfStr = listString.get(i);
                    //除去第四个和第七个字符，此处应该严谨；
                    lfStr = lfStr.substring(0,4) + lfStr.substring(5,7) + lfStr.substring(8,10);
                    field.set( sheetThree, Integer.parseInt( lfStr));
                }else{
                    field.set(sheetThree, Integer.parseInt(listString.get(i)));
                }

            }
            if (field.getType() == Double.class){
                field.set(sheetThree , Double.parseDouble(listString.get(i)));
            }

        }
        return sheetThree;
    }
}
