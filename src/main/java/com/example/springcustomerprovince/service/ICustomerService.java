package com.example.springcustomerprovince.service;

import com.example.springcustomerprovince.model.Customer;
import com.example.springcustomerprovince.model.Province;
import com.example.springcustomerprovince.repository.ICustomerRepository;

public interface ICustomerService extends IGeneralService<Customer> {
    Iterable<Customer> findAllByProvince(Province province);
}
