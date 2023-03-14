package com.ameya.example.hygieia.resources;

import com.codahale.metrics.annotation.Metered;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Action;

@Metered
@WebService(
        name = "HelloWorldPortType",
        serviceName = "HelloWorldService",
        targetNamespace = "http://com.ameya.example.hygieia")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class HelloWorldSoapService {

    @WebMethod
    public String sayHello() {
        return "Hello World!";
    }

    @WebMethod
    @WebResult(partName = "greetings")
    @Action(input = "http://com.ameya.example.hygieia/HelloWorldSoapService/sayHelloToUser",
            output = "http://com.ameya.example.hygieia/HelloWorldSoapService/sayHelloToUser")
    public String sayHelloToUser(@WebParam(name = "userName", partName = "userName") String userName) {
        return "Hello " + userName + "!";
    }
}
