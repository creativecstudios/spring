package com.ccs.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ccs.demo.entity.Inventory;
import com.ccs.demo.service.InventoryService;
import com.ccs.demo.service.InventoryServiceImpl;


@RestController
@CrossOrigin(value = "*")
public class Inventory_Controller {
	
	@Autowired
	InventoryService inventoryService;

	//create
	@PostMapping(value = "/inventory")
	public Inventory createInventory(@RequestBody Inventory inventory) {
		return inventoryService.createInventory(inventory);
	}
		
	//Retrive
	@CrossOrigin
	@GetMapping(value = "/inventory")
	public List<Inventory> getInventory(){
		return inventoryService.getInventory();
	}
	
	//Retrive by category
	@GetMapping(value = "/inventory/{category}")
	public List<Inventory> getByCategory(@PathVariable String category){
		
		return inventoryService.getByCategory(category);
		
	}

	//Update
	@PutMapping(value = "/inventory/{id}")
	public Inventory updateInventoryName(@PathVariable Integer id, @RequestBody Inventory inventory) {
		return inventoryService.updateInventory(id,inventory);
	}
	
	
	//delete
//	@DeleteMapping(value= "/inventory/{id}")
//	public String deleteInventory(Inventory inventory) {
//		return inventoryService.deleteInventory(inventory);
//	}
	@DeleteMapping(value= "/inventory/{id}")
	public String deleteInventory(@PathVariable Integer id) {
		return inventoryService.deleteInventory(id);
	}
	
	//response entityexample
	@GetMapping(value = "/responseinventory")
	public ResponseEntity<String> getInventoryRE(){
		inventoryService.getInventoryRE();
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).header("desc", "This is bad request").body("Oops!!");
	}

	//exceptionhandling example
	@GetMapping(value = "/exceptionInventory/{id}")
	public ResponseEntity<Inventory> exceptionGetByInventory(@PathVariable Integer id){
		if(id == 1) {
			throw new IllegalArgumentException();
		}
		return inventoryService.getByCategory(id);
	}
	
	@ExceptionHandler
	public ResponseEntity<Object> handleException(IllegalArgumentException e){
		return new ResponseEntity<Object>("Out of stock",HttpStatus.BAD_REQUEST);
	}
	
	@PostMapping(value = "/distinctinventory")
	public ResponseEntity<String> createInventoryDistinct(@RequestBody Inventory inventory){
		return inventoryService.createInventoryDistinct(inventory);
	}
}


