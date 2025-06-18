package com.example.springcustomerprovince.repository;

import com.example.springcustomerprovince.model.Province;
import org.springframework.data.repository.CrudRepository;

public interface IProvinceRepository extends CrudRepository<Province, Long> {
}
