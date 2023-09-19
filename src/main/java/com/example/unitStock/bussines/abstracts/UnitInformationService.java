package com.example.unitStock.bussines.abstracts;

import java.util.List;

import com.example.unitStock.core.results.DataResult;
import com.example.unitStock.core.results.Result;
import com.example.unitStock.entities.UnitInformation;

public interface UnitInformationService {
 DataResult<List<UnitInformation>> findAll();
 Result add(UnitInformation unitInformation);
 Result reduct(UnitInformation unitInformation);
 Result addUnit(UnitInformation unitInformation);
 Result reductUnit(UnitInformation unitInformation);
 Result addKg(UnitInformation unitInformation);
 Result reductKg(UnitInformation unitInformation);
}
