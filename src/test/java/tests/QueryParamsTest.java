package tests;

import static io.restassured.RestAssured.*;

import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class QueryParamsTest {

    @BeforeEach
    void setup() {
        baseURI = "https://jsonplaceholder.typicode.com";
    }

    @Test
    void shouldReturnPostsFromUserOne() {

        given()
                .baseUri(baseURI)
                .queryParam("userId", 1)

                .when()
                    .get("/posts")

                .then()
                    .statusCode(200)
                    .body("userId", everyItem(equalTo(1)));
    }
}