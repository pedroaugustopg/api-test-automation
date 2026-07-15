package tests;

import static io.restassured.RestAssured.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NegativeTest {

    @BeforeEach
    void setup() {
        baseURI = "https://jsonplaceholder.typicode.com";
    }

    @Test
    void shouldReturn404ForInvalidPost() {
        given()
                .baseUri(baseURI)

                .when()
                    .get("/posts/999999")

                .then()
                    .statusCode(404);
    }
}