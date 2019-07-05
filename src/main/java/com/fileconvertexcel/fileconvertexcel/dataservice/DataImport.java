package com.fileconvertexcel.fileconvertexcel.dataservice;

import java.util.List;

public interface DataImport {
    public void importDatabase();
    public List<Object> getObject();
    public List<Object> getAllByExcel(String filepath);
    public Object newObject(List<String> listString) throws IllegalAccessException;
}
