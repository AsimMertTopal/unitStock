package com.example.unitStock.bussines.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.unitStock.bussines.abstracts.ProductManagementService;
import com.example.unitStock.core.results.DataResult;
import com.example.unitStock.core.results.Result;
import com.example.unitStock.core.results.SuccessDataResult;
import com.example.unitStock.core.results.SuccessResult;
import com.example.unitStock.dataAccess.abstracts.ProductManagementDao;
import com.example.unitStock.dataAccess.abstracts.UnitInformationDao;
import com.example.unitStock.entities.ProductManagement;

import lombok.AllArgsConstructor;



@Service
@AllArgsConstructor

public class ProductManagementManager implements ProductManagementService{
	 ProductManagementDao productManagementDao;
	 UnitInformationDao unitInformationDao;
	
	
	
	@Override
	public Result add(ProductManagement productManagement) {
		ProductManagement product=new ProductManagement();
  		
		product.setProductName(productManagement.getProductName());
		product.setExpirationDate(productManagement.getExpirationDate());
		double Total=productManagement.getTotal();
		
		
		
		
		productManagementDao.save(productManagement);
		return new SuccessResult("Ürün Eklendi ");
	}


	@Override
	public Result addUnit(ProductManagement productManagement) {
ProductManagement product=new ProductManagement();
  		
		product.setProductName(productManagement.getProductName());
		product.setExpirationDate(productManagement.getExpirationDate());
		double Total=productManagement.getTotal();
		double newTotal=Total*1000;
		productManagement.setTotal(newTotal);
		
		
		
		productManagementDao.save(productManagement);
		return new SuccessResult("Ürün Eklendi ");
	}



	 @Override
	    public DataResult<List<ProductManagement>> findAll() {
	        
	        return new SuccessDataResult<List<ProductManagement>>(productManagementDao.findAll(), "Ürünler başarıyla alındı.");
	    }


	@Override
	public DataResult<List<ProductManagement>> findById(int id) {
		
		return new SuccessDataResult<List<ProductManagement>>(
		productManagementDao.findById(id), "Ürünler İD ye göre Listelendi.");
	}


	@Override
	public DataResult<List<ProductManagement>> findByTotalLessThan() {
		
		return new SuccessDataResult<List<ProductManagement>>(
				productManagementDao.findByTotalLessThan(20.0), "Stok Bilgisi Listelendi.");
	
	}


	@Override
	public DataResult<List<ProductManagement>> getByProductName(String productName) {
		return new SuccessDataResult<List<ProductManagement>>(
				productManagementDao.getByProductName(productName), "Ürünler İsme Göre başarıyla Listelendi.");
	}


	@Override
	public DataResult<List<ProductManagement>> getAllSortedByExpirationDate() {
		return new SuccessDataResult<List<ProductManagement>>(
				productManagementDao.findAllByOrderByExpirationDateDesc(), "Ürünler Tarihe Göre başarıyla Listelendi.");
		
	}







}
