package com.example.unitStock.api;

import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.unitStock.bussines.abstracts.UnitInformationService;
import com.example.unitStock.core.results.DataResult;
import com.example.unitStock.core.results.Result;
import com.example.unitStock.entities.UnitInformation;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Configuration
@RestController
@RequestMapping("/api/literStock")
@AllArgsConstructor
@NoArgsConstructor
public class UnitInformationsController {
 UnitInformationService unitInformationService;
 
 
 @GetMapping("/all")
 public DataResult<List<UnitInformation>> findAll(UnitInformation unitInformation){
	return this.unitInformationService.findAll();
	 
 }
 
 
 @PutMapping("/addLT")
 public Result add(UnitInformation unitInformation) {
	return this.unitInformationService.add(unitInformation);
	 
 }
 @PutMapping("/reductLT")
 public Result reduct(UnitInformation unitInformation) {
	return this.unitInformationService.reduct(unitInformation);
}
 @PutMapping("/addUnit")
 public Result addUnit(UnitInformation unitInformation) {
	return this.unitInformationService.add(unitInformation);
	 
 }
 @PutMapping("/reductUnit")
 public Result reductUnit(UnitInformation unitInformation) {
	return this.unitInformationService.reduct(unitInformation);
}
 @PutMapping("/addKG")
 public Result addKg(UnitInformation unitInformation) {
	return this.unitInformationService.add(unitInformation);
	 
 }
 @PutMapping("/reductKG")
 public Result reductKg(UnitInformation unitInformation) {
	return this.unitInformationService.reduct(unitInformation);
}
}
