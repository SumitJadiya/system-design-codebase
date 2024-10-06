package com.sumit.coding.design_patterns.structural.proxy.solution.dao;

import com.sumit.coding.design_patterns.structural.proxy.solution.model.EmployeeDo;

public interface EmployeeDao {

    void create(String clientId, EmployeeDo obj);

    void delete(String clientId, int employeeId);

    EmployeeDo get(String clientId, int employeeId);
}
