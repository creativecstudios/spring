package com.example.demo.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.example.demo.dao.StockDao;
import com.example.demo.model.Stock;
import com.example.demo.service.StockService;

@Service
public class StocksServiceImpl implements StockService{

	@Autowired
	StockDao stockdao;
	Stock stockdb;
	//create
	public ResponseEntity<String> createStock(Stock stock) {
		 
		 boolean exists = stockdao.existsbyStockname(stock);
		 if(exists == true) {
			 stockdao.save(stock);
			 return ResponseEntity.status(HttpStatus.OK).header("desc", "saved").body("Data saved successfully");
		 }
		 return ResponseEntity.status(HttpStatus.BAD_REQUEST).header("desc", "Bad input").body("Already exists");
	}
	
	//updatebyid
	public Stock updateStock(Integer id, Stock stock) {
		
	 stockdb = stockdao.findSpecific(id);
	 
	 if(Objects.nonNull(stock.getCategory()) && !"".equalsIgnoreCase(stock.getCategory())){
		 stockdb.setCategory(stock.getCategory());
	 }
	 else if(Objects.nonNull(stock.getStockname()) && !"".equalsIgnoreCase(stock.getStockname())) {
		 stockdb.setStockname(stock.getStockname());
	 }
	 else if(Objects.nonNull(stock.getQuantity())) {
		 stockdb.setQuantity(stock.getQuantity());
	 }
	 else if(Objects.nonNull(stock.getBaseprice())) {
		 stockdb.setBaseprice(stock.getBaseprice());
	 }
	 else if(Objects.nonNull(stock.getProfit())) {
		 stockdb.setProfit(stock.getProfit());
	 }
	 else if(Objects.nonNull(stock.getExpirydate())) {
		 stockdb.setExpirydate(stock.getExpirydate());
	 }
	 return stockdao.save(stockdb);
	}
	
	//getallstocks
	public List<Stock> getAllStocks() {
		return stockdao.getallStocks();
	}

	//deletestockbyid
	public String deleteStocks(Integer id) {
		// TODO Auto-generated method stub
		return stockdao.deletebyid(id);
	}

	//findbyId
	@Override
	public Stock findSpecific(Integer id) {
		// TODO Auto-generated method stub
		
		return stockdao.findSpecific(id);
	}

}
