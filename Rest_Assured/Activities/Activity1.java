package Activities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Activity1 {

    String ROOT_URI = "https://petstore.swagger.io/v2/pet";

    @Test(priority = 1)
    public void addNew(){

        String reqBody = "{\"id\": 77255, \"name\": \"Riley\", \"status\": \"alive\"}";

        Response response = given().contentType(ContentType.JSON).body(reqBody)
                .when().post(ROOT_URI);

        String body =  response.getBody().asPrettyString();
        System.out.println(body);

        response.then().body("id", equalTo(77255));
        response.then().body("name", equalTo("Riley"));
        response.then().body("status", equalTo("alive"));

    }

    @Test(priority = 2)
    public void get(){

        Response response = given().contentType(ContentType.JSON)
                .when().pathParam("petId", "77255")
                .get(ROOT_URI + "/{petId}");

        response.then().body("id", equalTo(77255));
        response.then().body("name", equalTo("Riley"));
        response.then().body("status", equalTo("alive"));

    }

    @Test(priority = 3)
    public void remove(){


        Response response =
                given().contentType(ContentType.JSON) // Set headers
                        .when().pathParam("petId", "77255") // Set path parameter
                        .delete(ROOT_URI + "/{petId}"); // Send DELETE request

        // Assertion
        response.then().body("code", equalTo(200));
        response.then().body("message", equalTo("77255"));
        
    }
}
