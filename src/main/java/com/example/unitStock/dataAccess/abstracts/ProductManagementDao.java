package com.example.unitStock.dataAccess.abstracts;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.unitStock.entities.ProductManagement;

public interface ProductManagementDao extends JpaRepository<ProductManagement, Integer> {
	  List <ProductManagement> findAll();
	  List<ProductManagement>  findById(int id);
	  List<ProductManagement>  findByTotalLessThan(double total);
	  List<ProductManagement>  getByProductName(String productName);
	  //List<ProductManagement>  getAllSortedByExpirationDate();

	  List<ProductManagement> findAllByOrderByExpirationDateDesc();

}
