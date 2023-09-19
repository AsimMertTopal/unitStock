package com.example.unitStock.bussines.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.unitStock.bussines.abstracts.UnitInformationService;
import com.example.unitStock.core.results.DataResult;
import com.example.unitStock.core.results.ErrorResult;
import com.example.unitStock.core.results.Result;
import com.example.unitStock.core.results.SuccessDataResult;
import com.example.unitStock.core.results.SuccessResult;
import com.example.unitStock.dataAccess.abstracts.UnitInformationDao;
import com.example.unitStock.dataAccess.abstracts.ProductManagementDao;
import com.example.unitStock.entities.UnitInformation;
import com.example.unitStock.entities.ProductManagement;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UnitInformationManager implements UnitInformationService {
	
	UnitInformationDao unitInformationDao;
	ProductManagementDao productManagementDao;
	
	
	@Override
	public Result add(UnitInformation unitInformation) {
	    ProductManagement productManagement;
	    int id = unitInformation.getId();
	    productManagement = this.productManagementDao.getById(id);

	    if (unitInformation != null) {
	        UnitInformation literStockadd = new UnitInformation();
	        literStockadd.setAddingStock(unitInformation.getAddingStock());
	        unitInformationDao.save(unitInformation);
	        
	        double totalInventory = productManagement.getTotal()/1000;
	        double addingStock  = unitInformation.getAddingStock()/1000;
	        double conclusionTotalInventory  = totalInventory + addingStock ;
	      
	        productManagement.setTotal(conclusionTotalInventory );
	        productManagementDao.save(productManagement);

	        return new SuccessResult("Litre Cinsiyle Ürün Stoğa Eklendi");
	    } else {
	        return new ErrorResult("Hatalı istek: Stok boş.");
	    }
	}




	@Override
	public Result reduct(UnitInformation unitInformation) {
	    ProductManagement productManagement;
	    int id = unitInformation.getId();
	    productManagement = this.productManagementDao.getById(id);

	 
	        
	        double totalInventory = productManagement.getTotal();
	        double addingStock  = unitInformation.getAddingStock()/1000;
	        double conclusionTotalInventory  = totalInventory - addingStock ;
	       
	        productManagement.setTotal(conclusionTotalInventory );
	        productManagementDao.save(productManagement);

	        return new SuccessResult("Litre  Cinsiyle Ürün Stoktan Çıkarıldı");
	    } 
	    
	


	@Override
	public DataResult<List<UnitInformation>> findAll() {
		return new SuccessDataResult<List<UnitInformation>> 
		 (this.unitInformationDao.findAll(),"Litre ve Kilogram indeksli Ürünler Listelendi");
	}




	@Override
	public Result addUnit(UnitInformation unitInformation) {
		 ProductManagement productManagement;
		    int id = unitInformation.getId();
		    productManagement = this.productManagementDao.getById(id);

		    if (unitInformation != null) {
		        UnitInformation literStockadd = new UnitInformation();
		        literStockadd.setAddingStock(unitInformation.getAddingStock());
		        unitInformationDao.save(unitInformation);
		        
		        long totalInventory = (long) productManagement.getTotal();
		        long addingStock  = (long) unitInformation.getAddingStock();
		        long conclusionTotalInventory  = totalInventory + addingStock ;
		      
		        productManagement.setTotal(conclusionTotalInventory );
		        productManagementDao.save(productManagement);

		        return new SuccessResult("Adet Cinsiyle Ürün Stoğa Eklendi");
		    } else {
		        return new ErrorResult("Hatalı istek: Stok boş.");
		    }
	}




	@Override
	public Result reductUnit(UnitInformation unitInformation) {
		 ProductManagement productManagement;
		    int id = unitInformation.getId();
		    productManagement = this.productManagementDao.getById(id);

		 
		        
		        long totalInventory = (long) productManagement.getTotal();
		        long addingStock  = (long) unitInformation.getAddingStock();
		        long conclusionTotalInventory  = totalInventory - addingStock ;
		       
		        productManagement.setTotal(conclusionTotalInventory );
		        productManagementDao.save(productManagement);

		        return new SuccessResult("Adet Cinsiyle Ürün Stoktan Çıkarıldı");
		    }




	@Override
	public Result addKg(UnitInformation unitInformation) {
		 ProductManagement productManagement;
		    int id = unitInformation.getId();
		    productManagement = this.productManagementDao.getById(id);

		    if (unitInformation != null) {
		        UnitInformation literStockadd = new UnitInformation();
		        literStockadd.setAddingStock(unitInformation.getAddingStock());
		        unitInformationDao.save(unitInformation);
		        
		        double totalInventory = productManagement.getTotal()/1000;
		        double addingStock  = unitInformation.getAddingStock()/1000;
		        double conclusionTotalInventory  = totalInventory + addingStock ;
		      
		        productManagement.setTotal(conclusionTotalInventory );
		        productManagementDao.save(productManagement);

		        return new SuccessResult("Kilogram Cinsiyle Ürün Stoğa Eklendi");
		    } else {
		        return new ErrorResult("Hatalı istek: Stok boş.");
		    }
	}




	@Override
	public Result reductKg(UnitInformation unitInformation) {
	    ProductManagement productManagement;
	    int id = unitInformation.getId();
	    productManagement = this.productManagementDao.getById(id);

	 
	        
	        double totalInventory = productManagement.getTotal();
	        double addingStock  = unitInformation.getAddingStock()/1000;
	        double conclusionTotalInventory  = totalInventory - addingStock ;
	       
	        productManagement.setTotal(conclusionTotalInventory );
	        productManagementDao.save(productManagement);

	        return new SuccessResult("Kilogram  Cinsiyle Ürün Stoktan Çıkarıldı");
	} 
}
