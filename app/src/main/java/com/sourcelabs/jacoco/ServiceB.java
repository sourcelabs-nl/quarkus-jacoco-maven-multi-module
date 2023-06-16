package com.sourcelabs.jacoco;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ServiceB {

    public String onlyTestedThroughSIT() {
        return "This method is only tested in a SystemTest in another module";
    }
}
