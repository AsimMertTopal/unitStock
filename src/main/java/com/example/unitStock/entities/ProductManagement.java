package com.example.unitStock.entities;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="product_management_page")
public class ProductManagement {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name="product_id")
	 private int id;
	 
	 @Column(name="product_name")
	 private String productName;
	 
	 @Column(name="total")
	 private double total;
	 
	 @Temporal(TemporalType.DATE)
	 @DateTimeFormat(pattern= "yyyy-MM-dd")
	 @Column(name="expiration_date")
	 private Date expirationDate;
	 
	 @Column(name="liter_id")
	 private int literId;
	 
	 @Column(name="stock_id")
		private int stockId;
}



