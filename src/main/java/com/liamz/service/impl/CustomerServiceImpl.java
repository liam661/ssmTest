package com.liamz.service.impl;

import com.liamz.dao.CustomerDao;
import com.liamz.pojo.Customer;
import com.liamz.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDao customerDao;
    @Override
    public Customer findCustomerById(Integer id) {
        return this.customerDao.findCustomerById(id);
    }
}
