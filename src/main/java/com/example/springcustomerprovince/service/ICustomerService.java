package com.example.springcustomerprovince.service;

import com.example.springcustomerprovince.model.Customer;
import com.example.springcustomerprovince.model.Province;
import com.example.springcustomerprovince.repository.ICustomerRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ICustomerService extends IGeneralService<Customer> {
    Iterable<Customer> findAllByProvince(Province province);

    Page<Customer> findAll(Pageable pageable);

    Page<Customer> findAllByName(Pageable pageable, String name);
}
