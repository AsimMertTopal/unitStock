package com.example.unitStock.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.unitStock.entities.UnitInformation;



public interface UnitInformationDao extends JpaRepository<UnitInformation, Integer> {
      List<UnitInformation>  findAll();
	  List<UnitInformation>  getByLiterId(int literId);
	  List<UnitInformation>  getByAddingStock(double addingStock);

}
