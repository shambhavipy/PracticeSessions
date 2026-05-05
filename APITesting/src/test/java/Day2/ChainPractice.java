package Day2;

import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;

public class ChainPractice {

    public static void main(String[] args) {

        baseURI = "https://api.example.com";

        // ========================
        // STEP 1: POST (Create)
        // ========================
        Map<String, Object> body = new HashMap<>();
        body.put("name", "Java");
        body.put("price", 300);

        Response postResponse = given()
                .header("Content-Type", "application/json")
                .body(body)
                .when()
                .post("/books");

        // Extract ID
        String bookId = postResponse.jsonPath().getString("id");

        System.out.println("Created Book ID: " + bookId);


        // ========================
        // STEP 2: GET (Fetch)
        // ========================
        Response getResponse = given()
                .when()
                .get("/books/" + bookId);

        getResponse.then().statusCode(200);

        String name = getResponse.jsonPath().getString("name");
        System.out.println("Book Name: " + name);


        // ========================
        // STEP 3: PUT (Update)
        // ========================
        Map<String, Object> updateBody = new HashMap<>();
        updateBody.put("name", "Java Updated");
        updateBody.put("price", 500);

        Response putResponse = given()
                .header("Content-Type", "application/json")
                .body(updateBody)
                .when()
                .put("/books/" + bookId);

        putResponse.then().statusCode(200);


        // ========================
        // STEP 4: DELETE (Cleanup)
        // ========================
        Response deleteResponse = given()
                .when()
                .delete("/books/" + bookId);

        deleteResponse.then().statusCode(200);

        System.out.println("Book Deleted Successfully");
    }
}
