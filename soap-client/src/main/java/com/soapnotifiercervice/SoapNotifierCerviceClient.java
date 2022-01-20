package com.soapnotifiercervice;

import com.soapnotifiercervice.model.Employee;
import com.soapnotifiercervice.service.EmployeeServiсe;


import java.util.logging.Logger;

public class SoapNotifierCerviceClient {

    public static final Logger LOGGER = Logger.getGlobal();

    public static void main(String[] args) {
        EmployeeServiсe employeeServiсe = new EmployeeServiсe() {
            @Override
            public Employee getEmployee(String name) {
                return null;
            }
        };

        LOGGER.info("Invocation of SOAP Server - start.");

        Employee employee = employeeServiсe.getEmployee("Ivan");


      /*  LOGGER.info("Invocation of SOAP Server - end. Employee's last name: "
                + employee.getLastName());*/
    }

}
