package com.ccs.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ccs.demo.entity.Inventory;

public interface InventoryRepo extends JpaRepository<Inventory, Integer> {

	List<Inventory> findAllBycategory(String category);

	

	boolean existsBystockname(String stockname);

}
