package com.sumit.coding.design_patterns.structural.proxy.solution.dao.impl;

import com.sumit.coding.design_patterns.structural.proxy.solution.dao.EmployeeDao;
import com.sumit.coding.design_patterns.structural.proxy.solution.model.EmployeeDo;

public class EmployeeDaoImpl implements EmployeeDao {
    @Override
    public void create(String clientId, EmployeeDo obj) {
        System.out.println("created new user");
    }

    @Override
    public void delete(String clientId, int employeeId) {
        System.out.println("delete the user with employeeId :" + employeeId);
    }

    @Override
    public EmployeeDo get(String clientId, int employeeId) {
        System.out.println("fetching the details for user with employeeId :" + employeeId);
        return new EmployeeDo();
    }
}
