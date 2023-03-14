package com.ameya.example.hygieia;

import com.ameya.example.hygieia.resources.HelloWorldSoapService;
import com.roskart.dropwizard.jaxws.EndpointBuilder;
import com.roskart.dropwizard.jaxws.JAXWSBundle;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class HygieiaApplication extends Application<HygieiaConfiguration> {

    private JAXWSBundle jaxWsBundle = new JAXWSBundle();

    public static void main(final String[] args) throws Exception {
        new HygieiaApplication().run(args);
    }

    @Override
    public String getName() {
        return "Hygieia";
    }

    @Override
    public void initialize(final Bootstrap<HygieiaConfiguration> bootstrap) {
        bootstrap.addBundle(jaxWsBundle);
    }

    @Override
    public void run(final HygieiaConfiguration configuration,
                    final Environment environment) {
        jaxWsBundle.publishEndpoint(
                new EndpointBuilder("/hello", new HelloWorldSoapService()));
    }

}
