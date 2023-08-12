package com.example.googlejava.Api;

import java.util.ArrayList;
import java.util.List;

public class MyAPi {
    private List<String> data;
    public MyAPi(List<String> data){
        this.data = data;
    }
    public List<String> getData(){
        return data;
    }
    public void setData(List<String> data){
        this.data = data;
    }
    public void addData(String newData){
        data.add(newData);
    }
    public void removeData(String dataToRemove){
        data.remove(dataToRemove);
    }
    public static void main(String args []){
        List<String> dataLisst = new ArrayList<>();
        dataLisst.add("Data 1");
        dataLisst.add("data 2");
        MyAPi myApi = new MyAPi(dataLisst);
        System.out.println("Data list :"+myApi.getData());
        myApi.addData("New Data");
        System.out.println("Updated Data List :"+myApi.getData());
        myApi.removeData("Data 1");
        System.out.println("Final Data List :"+myApi.getData());
    }
}
