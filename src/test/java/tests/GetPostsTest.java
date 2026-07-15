package tests;

import static io.restassured.RestAssured.*;

import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GetPostsTest {

    @BeforeEach
    void setup() {
        baseURI = "https://jsonplaceholder.typicode.com";
    }

    @Test
    void shouldReturnStatus200AndJsonContentType() {
        given()
                .baseUri(baseURI)

                .when()
                    .get("/posts/1")

                .then()
                    .statusCode(200)
                    .contentType("application/json; charset=utf-8");
    }

    @Test
    void shouldValidatePostFields() {
        given()
                .baseUri(baseURI)

                .when()
                    .get("/posts/1")

                .then()
                    .statusCode(200)
                    .body("userId", equalTo(1))
                    .body("id", equalTo(1))
                    .body("title", not(emptyOrNullString()))
                    .body("body", not(emptyOrNullString()));
    }

    @Test
    void shouldReturnOneHundredPosts() {
        given()
                .baseUri(baseURI)

                .when()
                    .get("/posts")

                .then()
                    .statusCode(200)
                    .body("size()", equalTo(100));
    }

    @Test
    void shouldContainPostWithIdTen() {
        given()
                .baseUri(baseURI)

                .when()
                    .get("/posts")

                .then()
                    .statusCode(200)
                    .body("id", hasItem(10));
    }

    @Test
    void shouldExtractPostTitle() {
        String title =

                given()
                        .baseUri(baseURI)

                        .when()
                            .get("/posts/1")

                        .then()
                            .statusCode(200)
                            .extract()
                            .path("title");

        System.out.println(title);
    }
}