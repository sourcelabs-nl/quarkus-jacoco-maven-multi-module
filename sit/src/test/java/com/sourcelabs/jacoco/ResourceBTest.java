package com.sourcelabs.jacoco;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class ResourceBTest {

    @Test
    public void testHelloEndpoint() {
        given()
                .when().get("/use-b")
                .then()
                .statusCode(200)
                .body(is("This method is only tested in a SystemTest in another module"));
    }

}