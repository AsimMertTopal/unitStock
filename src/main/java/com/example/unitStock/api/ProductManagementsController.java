package com.example.unitStock.api;

import java.util.Date;
import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.unitStock.bussines.abstracts.ProductManagementService;
import com.example.unitStock.core.results.DataResult;
import com.example.unitStock.core.results.Result;
import com.example.unitStock.entities.ProductManagement;

import lombok.AllArgsConstructor;

@Configuration
@RestController
@AllArgsConstructor
@RequestMapping("/api/products")
public class ProductManagementsController {
ProductManagementService productManagementService;

@PostMapping("/add")
public Result add(ProductManagement productManagement) {
	return this.productManagementService.add(productManagement);
	
}
@PostMapping("/addUnit")
public Result addUnit(ProductManagement productManagement) {
	return this.productManagementService.add(productManagement);
	
}

@GetMapping("/all")
public DataResult<List<ProductManagement>> findAll(){
	return this.productManagementService.findAll();
	
}
@GetMapping("/getTotal")
public DataResult<List<ProductManagement>> getByTotal(){
	return this.productManagementService.findByTotalLessThan();
	
}
@GetMapping("/getName")
public DataResult<List<ProductManagement>> getByProductName(String productName){
	return this.productManagementService.getByProductName(productName);
	
}

@GetMapping("/byId")
public DataResult<List<ProductManagement>> findById(int id){
	return this.productManagementService.findById(id);
	
}

@GetMapping("/sortedByExpirationDate")
public DataResult<List<ProductManagement>> findAllByOrderByExpirationDateAsc() {
	return this.productManagementService.getAllSortedByExpirationDate();
}


}
