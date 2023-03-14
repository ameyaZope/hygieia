package com.ameya.example.hygieia.resources;

import com.codahale.metrics.annotation.Metered;

import javax.jws.WebMethod;
import javax.jws.WebService;

@Metered
@WebService(
        name = "HelloWorldPortType",
        serviceName = "HelloWorldService",
        targetNamespace = "http://com.ameya.example.hygieia")
public class HelloWorldSoap {

    @WebMethod
    public String sayHello() {
        return "Hello World!";
    }
}
