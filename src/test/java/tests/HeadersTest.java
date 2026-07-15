package tests;

import static io.restassured.RestAssured.*;

import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HeadersTest {

    @BeforeEach
    void setup() {
        baseURI = "https://jsonplaceholder.typicode.com";
    }

    @Test
    void shouldValidateResponseHeaders() {
        given()
                .baseUri(baseURI)

                .when()
                    .get("/posts/1")

                .then()
                    .statusCode(200)
                    .header("Content-Type",
                            containsString("application/json"));
    }
}