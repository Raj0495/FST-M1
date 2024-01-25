package GitHub_RestAssured_Project;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
//import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class GithubRestAssuredProject {

    RequestSpecification reqspec;
    ResponseSpecification resspec;

    String key = "ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAIOKt47U7rV2MERKqRFW4Q8AT3Mz7DwwDlPpvgb2px1V/";
    int keyId;

    @BeforeClass
    public void setup(){

        reqspec = new RequestSpecBuilder().setContentType(ContentType.JSON)
                .addHeader("Authorization", "token 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")
                .setBaseUri("https://api.github.com").build();

    }

    @Test(priority = 1)
    public void postRequest(){

        //String reqBody = "{\"title\": \"TestAPIKey\", \"key\": \"ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAIOKt47U7rV2MERKqRFW4Q8AT3Mz7DwwDlPpvgb2px1V/\"}";

        Map<String, Object> reqBody = new HashMap<>();
        reqBody.put("title","TestAPIKey");
        reqBody.put("key",key);

       Response response =  given().spec(reqspec).body(reqBody).
               when().post("/user/keys");

        System.out.println(response);
       keyId = response.then().extract().path("id");
       System.out.println(keyId);
       response.then().body("code", equalTo(201));

    }

    /*@Test(priority = 2)
    public void getRequest(){

        Response response = given().spec(reqspec).pathParam("keyId", keyId)
                .get("/user/keys/{keyId}");

        String resBody = response.getBody().asPrettyString();
        System.out.println(resBody);

        response.then().body("code", equalTo(200));


    }

    @Test(priority = 3)
    public void delRequest(){

        Response response = given().spec(reqspec).pathParam("keyId", keyId).when()
                .delete("/user/keys/{keyId}");

        String resBody = response.getBody().asPrettyString();
        System.out.println(resBody);

        response.then().body("code", equalTo(204));

    }*/



}
