package com.ccs.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ccs.demo.entity.Inventory;
import com.ccs.demo.repository.InventoryRepo;

@Service
public class InventoryServiceImpl implements InventoryService{
	
	@Autowired
	InventoryRepo inventoryRepo;
	
	public Inventory createInventory(Inventory inventory) {
		return inventoryRepo.save(inventory);
	}
	
	public List<Inventory> getInventory() {
		return inventoryRepo.findAll();
	}

	public List<Inventory> getByCategory(String category) {
		return inventoryRepo.findAllBycategory(category);
	}

	public Inventory updateInventory(Integer id,Inventory inventory) {

		Inventory invdb = inventoryRepo.findById(id).get();
		
		if(Objects.nonNull(inventory.getCategory()) && !"".equalsIgnoreCase(inventory.getCategory())) {
			invdb.setCategory(inventory.getCategory());
		}
		if(Objects.nonNull(inventory.getStockname()) && !"".equalsIgnoreCase(inventory.getStockname())) {
			invdb.setStockname(inventory.getStockname());
		}
		if(Objects.nonNull(inventory.getQuantity())) {
			invdb.setQuantity(inventory.getQuantity());
		}
		if(Objects.nonNull(inventory.getBaseprice())) {
			invdb.setBaseprice(inventory.getBaseprice());
		}
		if(Objects.nonNull(inventory.getProfit())) {
			invdb.setProfit(inventory.getProfit());
		}if(Objects.nonNull(inventory.getExpirydate())) {
			invdb.setExpirydate(inventory.getExpirydate());
		}
		return inventoryRepo.save(invdb);
	}

	public String deleteInventory(Integer id) {
		inventoryRepo.deleteById(id);
		return "Record Deleted";
	}

	@Override
	public void getInventoryRE() {
		
		List<Inventory> list = inventoryRepo.findAll();
		
	}

	@Override
	public ResponseEntity<Inventory> getByCategory(Integer id) {
		// TODO Auto-generated method stub
		inventoryRepo.findById(id);
		return null;
	}

	@Override
	public ResponseEntity<String> createInventoryDistinct(Inventory inventory) {
		Inventory inv = inventory;
		boolean exists = inventoryRepo.existsBystockname(inv.getStockname());
		
		if(exists) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).header("desc", "duplicate value not accepted").body("stock already exists");
		}
		else {
			inventoryRepo.save(inventory);
		}
		return ResponseEntity.status(HttpStatus.OK).header("desc", "stocks saved").body("Stocks saved");
		
	}

}
