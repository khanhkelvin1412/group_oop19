package com.service;

import com.modelDataCK.StockModel;

import java.io.File;
import java.util.List;

public interface IGetDataService {
    List<StockModel> getDataToList(File file);
}
