import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class TestAPI {

    @Test
    public void Test_1() {

        Response response = RestAssured.get("https://dummy.restapiexample.com/");

        System.out.println(response.getStatusCode());
        System.out.println(response.getTime());
        System.out.println(response.getBody().asString());
        System.out.println(response.getStatusLine());
        System.out.println(response.getHeader("content-type"));
        int statuscode = response.getStatusCode();
        Assert.assertEquals(statuscode, 200);

        given()
                .baseUri("https://reqres.in")
                .header("Content-Type", "application/json")
                .body("{ \"name\": \"Shambhavi\", \"job\": \"QA\" }")
                .when()
                .post("/api/users")
                .then()
                .statusCode(201)
                .body("name", equalTo("Shambhavi"));

    }
}
