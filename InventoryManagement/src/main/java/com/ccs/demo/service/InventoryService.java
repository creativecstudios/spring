package com.ccs.demo.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.ccs.demo.entity.Inventory;

public interface InventoryService {

	public Inventory createInventory(Inventory inventory);

	public List<Inventory> getInventory();

	public List<Inventory> getByCategory(String category);

	public Inventory updateInventory(Integer id,Inventory inventory);

	public String deleteInventory(Integer id);

	public void getInventoryRE();

	public ResponseEntity<Inventory> getByCategory(Integer id);

	public ResponseEntity<String> createInventoryDistinct(Inventory inventory);

	

	
}
