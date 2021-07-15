package com.example.demo.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.demo.model.Stock;

public class StockRowMapper implements RowMapper<Stock>{

	@Override
	public Stock mapRow(ResultSet resultset,int id) throws SQLException{
	
		Stock stock = new Stock();
		stock.setId(resultset.getInt("id"));
		stock.setCategory(resultset.getString("category"));
		stock.setStockname(resultset.getString("stockname"));
		stock.setQuantity(resultset.getInt("quantity"));
		stock.setBaseprice(resultset.getInt("baseprice"));
		stock.setProfit(resultset.getInt("profit"));
		stock.setExpirydate(resultset.getDate("expirydate"));
		return stock;
	}

	
}
