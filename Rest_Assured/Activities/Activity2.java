package Activities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Activity2 {

    final static String ROOT_URI = "https://petstore.swagger.io/v2/user";

    @Test(priority = 1)
    public void addNewUserFromFile() throws IOException {
        FileInputStream inputJSON = new FileInputStream("src/test/java/activities/userinfo.json");

        String reqBody = new String(inputJSON.readAllBytes());

        Response response = given().contentType(ContentType.JSON).body(reqBody).when().post(ROOT_URI);

        inputJSON.close();

        response.then().body("code", equalTo(200));
        response.then().body("message", equalTo("9901"));


    }
}
