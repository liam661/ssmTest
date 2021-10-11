package com.liamz.dao;

import com.liamz.pojo.Customer;

public interface CustomerDao {
    /**
     * 根据id 查询客户信息
     * @param id
     * @return
     */
    public Customer findCustomerById(Integer id);
}
