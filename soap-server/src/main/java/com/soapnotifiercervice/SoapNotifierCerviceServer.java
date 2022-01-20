package com.soapnotifiercervice;

import com.soapnotifiercervice.service.EmployeeServiceImpl;

import javax.xml.ws.Endpoint;
import java.util.logging.Logger;

public class SoapNotifierCerviceServer {

    private static final Logger LOGGER = Logger.getGlobal();

    public static void main(String[] args) {

        LOGGER.info("Creating WEB server and publishing SOAP endpoint");
        Endpoint.publish("http://localhost:1986/wss/employeeservice", new EmployeeServiceImpl());
    }
}
