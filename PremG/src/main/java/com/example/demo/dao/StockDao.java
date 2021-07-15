package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.Stock;

public interface StockDao {

	//create
	public Stock save(Stock stock);

	public List<Stock> getallStocks();

	public String deletebyid(Integer id);

	public Stock findSpecific(Integer id);

	public boolean existsbyStockname(Stock stock);

}
