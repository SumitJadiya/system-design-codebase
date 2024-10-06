package com.sumit.coding.design_patterns.structural.proxy.solution.proxy;

import com.sumit.coding.design_patterns.structural.proxy.solution.dao.EmployeeDao;
import com.sumit.coding.design_patterns.structural.proxy.solution.dao.impl.EmployeeDaoImpl;
import com.sumit.coding.design_patterns.structural.proxy.solution.model.EmployeeDo;
import lombok.SneakyThrows;

public class EmployeeDaoProxy implements EmployeeDao {

    EmployeeDao employeeDaoObj;

    public EmployeeDaoProxy() {
        this.employeeDaoObj = new EmployeeDaoImpl();
    }

    @Override
    @SneakyThrows
    public void create(String clientId, EmployeeDo obj) {
        if (clientId.equals("ADMIN")) {
            employeeDaoObj.create(clientId, obj);
            return;
        }
        throw new Exception("Access Denied");
    }

    @Override
    @SneakyThrows
    public void delete(String clientId, int employeeId) {
        if (clientId.equals("ADMIN")) {
            employeeDaoObj.delete(clientId, employeeId);
            return;
        }
        throw new Exception("Access Denied");
    }

    @Override
    @SneakyThrows
    public EmployeeDo get(String clientId, int employeeId) {
        if (clientId.equals("ADMIN") || clientId.equals("USER"))
            return employeeDaoObj.get(clientId, employeeId);

        throw new Exception("Access Denied");
    }
}
