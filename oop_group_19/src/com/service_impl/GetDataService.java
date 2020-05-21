package com.service_impl;

import com.mapper.IStockMapper;
import com.mapper.StockMapper;
import com.modelDataCK.StockModel;
import com.service.IGetDataService;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GetDataService implements IGetDataService {

    private BufferedReader bf;


    @Override
    public List<StockModel> getDataToList(File file) {
        List<StockModel> stockList = new ArrayList<>();
        String line;
        IStockMapper stockMapper = null;

        try {
            bf = new BufferedReader(new FileReader(file));
            while ((line = bf.readLine()) != null){
                stockMapper = new StockMapper();
                stockList.add(stockMapper.mapper(line));
            }
//            System.out.println(stockList.size());
        } catch (IOException e){
            e.printStackTrace();
        }
        finally {
            try {
                if(bf != null){
                    bf.close();
                }
            } catch (IOException e){
                e.getMessage();
            }
        }
        return stockList;
    }
}
