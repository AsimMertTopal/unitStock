package com.example.unitStock.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="liter_stock")
public class UnitInformation {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)	 
 @Column(name="liter_id")
private int literId;
 
 @Column(name="adding_stock")
 private double addingStock;
 
 @Column(name="product_id")
 private int id;
}
