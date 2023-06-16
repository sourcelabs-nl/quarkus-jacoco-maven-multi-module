package com.sourcelabs.jacoco;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ServiceA {

    public void onlyUnitTestedInSameModule() {
        System.out.println("Fucking jacoco");
    }

}
