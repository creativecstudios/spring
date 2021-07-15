package com.example.demo.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.example.demo.model.Stock;

public interface StockService {

	public ResponseEntity<String> createStock(Stock stock);

	public Stock updateStock(Integer id, Stock stock);

	public List<Stock> getAllStocks();

	public String deleteStocks(Integer id);

	public Stock findSpecific(Integer id);

}
