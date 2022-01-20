package com.soapnotifiercervice.service;

import com.soapnotifiercervice.model.Employee;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService

 //@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface EmployeeServiсe {
    @WebMethod
    Employee getEmployee(String name);
}
