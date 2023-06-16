package com.sourcelabs.jacoco;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

//@WebTest // ignore me for now
@QuarkusTest
class StandAloneResourceTest {

    @Test
    void testHelloEndpoint() {
        given()
                .when().get("/hello")
                .then()
                .log()
                .all()
                .statusCode(200)
                .body(is("Hello RESTEasy"));
    }

}