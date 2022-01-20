package com.soapnotifiercervice.service;

import com.soapnotifiercervice.model.Employee;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(endpointInterface = "com.soapnotifiercervice.service.EmployeeServiсe")
public class EmployeeServiceImpl implements EmployeeServiсe {

    @Override
    @WebMethod
    public Employee getEmployee(String name){
        return new Employee(name,
                "Ivanov",
                18,
                "Junior",
                "null");
    }


}
