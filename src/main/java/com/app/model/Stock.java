package com.app.model;

import java.util.ArrayList;
import java.util.List;

public class Stock {

    private Integer stockId;
    private String productName;
    private int price;
    private int quantity;

    public Stock(Integer stockId, String productName, int price, int quantity) {
        this.stockId = stockId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public Stock() {
    }

    public Integer getStockId() {
        return stockId;
    }

    public void setStockId(Integer stockId) {
        this.stockId = stockId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "stockId=" + stockId +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    List<Stock> stockList = new ArrayList<Stock>();

    public static List<Stock> stockList() {
        List<Stock> stockList = new ArrayList<Stock>();
        stockList.add(new Stock(1,"mobile",25000,2000));
        stockList.add(new Stock(1,"tablet",15000,1000));
        stockList.add(new Stock(1,"tv",50000,5000));
        stockList.add(new Stock(1,"laptop",40000,7000));
        return stockList;
    }
}
