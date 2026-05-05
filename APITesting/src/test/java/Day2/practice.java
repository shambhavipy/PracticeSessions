package Day2;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class practice {

    @Test
    public void httpRequests() {
                //headers/Request body/parameters
                given()
                        //URL/endpoint/which method needs to Pass
                .when()
                        .get("https://api.example.com/books")
                .then()
                        .statusCode(200)
                        .body("status", equalTo("Success"))
                        .body("data[0].name", equalTo("Ikigai"));

    }
}
