package com.sourcelabs.jacoco;

import org.junit.jupiter.api.Test;


class ATest {

    @Test
    void aTest() {
        new ServiceA().onlyUnitTestedInSameModule();
    }

}