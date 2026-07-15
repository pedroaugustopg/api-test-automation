package tests;

import static io.restassured.RestAssured.*;

import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PerformanceTest {

    @BeforeEach
    void setup() {
        baseURI = "https://jsonplaceholder.typicode.com";
    }

    @Test
    void shouldRespondInLessThanTwoSeconds() {
        given()
                .baseUri(baseURI)

                .when()
                    .get("/posts/1")

                .then()
                    .statusCode(200)
                    .time(lessThan(2000L));
    }
}