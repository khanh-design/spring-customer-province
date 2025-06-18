package com.example.springcustomerprovince.repository;

import com.example.springcustomerprovince.model.Customer;
import com.example.springcustomerprovince.model.Province;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ICustomerRepository extends CrudRepository<Customer, Long> {
    Iterable<Customer> findAllByProvince(Province province);
}
