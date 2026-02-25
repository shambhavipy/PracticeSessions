import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class GetAndPostExample {

   /* //@Test(Priorty 1)
    public void testGet() {
        //baseURI = "https://reqres.in/api/users";

        given().header("x-api-key", "reqres_896da7e093f848cfa046a5589984bad1").when().get("https://reqres.in/api/users")

                .then().statusCode(200).body("page", equalTo(1)).log().all();
    } */

    @Test

    public void Posttest() {
        String jsonBody = "{ \"userId\": 1, \"id\": 199, \"title\": \"Shruti\", \"body\": \"hardwork\" }";

        HashMap testpost = new HashMap();
        testpost.put("userId", 1);
        testpost.put("id", 199);
        testpost.put("title", "Shruti");
        testpost.put("body", "hardwork");
        given()
                .contentType(ContentType.JSON)
                .body(jsonBody)
                .when()
                .post("https://jsonplaceholder.typicode.com/posts")
                .then()
                .statusCode(201);


    }


}
