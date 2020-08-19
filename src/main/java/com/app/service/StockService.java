package com.app.service;

import com.app.model.Stock;

import java.util.ArrayList;
import java.util.List;

public class StockService {

    List<Stock> stockList = Stock.stockList();

    public List<Stock> addStockList(Stock stock) {
        stockList.add(stock);
        return stockList;
    }

    public List<Stock> modifyStockList(Integer id, Stock modifiedStock) {
        for (Stock stock : stockList){
            if (id.equals(stock.getStockId())) {
                stockList.remove(stock);
                stockList.add(modifiedStock);
            }
        }
        return stockList;
    }

    public List<Stock> deleteStockList(Stock stockToDelete) {
        stockList.remove(stockToDelete);
        return stockList;
    }
}
