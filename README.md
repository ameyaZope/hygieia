# Hygieia

## Say Hello SOAP Web Service

The web service exposed here is ```/soap/hello```  and is created using SOAP 1.1
To access this web service start the dropwizard server on localhost and hit the below api

```
http://localhost:8080/soap/hello?WSDL
```

The above endpopint gives the WSDL XML web service definition file.
Import the XML content rendered on above page into postman via RAW text.
Or you can import via link (in postman) and past the above localhost link into it. 
