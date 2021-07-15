package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Stock;
import com.example.demo.service.StockService;
import java.util.List;

@RestController
@RequestMapping("/stock")
public class Stockcontroller {
	
	@Autowired
	StockService stockService;

	//create
	@PostMapping("/create")
	public ResponseEntity<String> createStock(@RequestBody Stock stock) {
		return stockService.createStock(stock);
		 
	}
	
	//updatebyid
	@PutMapping("/update/{id}")
	public Stock updateStock(@PathVariable Integer id, @RequestBody Stock stock) {
		return stockService.updateStock(id,stock);
	}
	
	//getallstocks
	@GetMapping("/getallstocks")
	public List<Stock> getAllStocks(){
		return stockService.getAllStocks();
	}
	
	//findbyid
	@GetMapping("/find/{id}")
	public Stock findspecific(@PathVariable Integer id) {
		return  stockService.findSpecific(id);
	}
	
	//deletestock
	@DeleteMapping("/delete/{id}")
	public String deleteStock(@RequestBody Stock stock, @PathVariable Integer id) {
		return stockService.deleteStocks(id);
	}

}
