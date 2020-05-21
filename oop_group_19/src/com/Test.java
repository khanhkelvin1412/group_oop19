package com;

import com.modelDataCK.StockModel;
import com.service.IGetDataService;
import com.service_impl.GetDataService;

import java.io.File;
import java.util.List;

public class Test {

    public static void main(String[] args){
        File file = new File("data_table.txt");
        IGetDataService getData = new GetDataService();
        List<StockModel> stockModels = null;
        stockModels = getData.getDataToList(file);
        System.out.println(stockModels.size());
//        System.out.println("hello");


    }
}
