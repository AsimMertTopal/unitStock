package com.example.unitStock.bussines.abstracts;

import java.util.Date;
import java.util.List;

import org.springframework.http.ResponseEntity;

import com.example.unitStock.core.results.DataResult;
import com.example.unitStock.core.results.Result;
import com.example.unitStock.entities.ProductManagement;

public interface ProductManagementService {
	  Result add(ProductManagement productManagement);
	  Result addUnit(ProductManagement productManagement);
	  DataResult<List<ProductManagement>> findAll();
	  DataResult<List<ProductManagement>>  findById(int id);
	  DataResult<List<ProductManagement>>  findByTotalLessThan();
	  DataResult<List<ProductManagement>>  getByProductName(String productName);
	  DataResult<List<ProductManagement>>  getAllSortedByExpirationDate();

}
