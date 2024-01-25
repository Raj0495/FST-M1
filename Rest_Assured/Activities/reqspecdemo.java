package Examples;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThan;

public class reqspecdemo {

    RequestSpecification reqspec;
    ResponseSpecification resp;

    int petId;


    @BeforeClass
    public void setup() {
        // create a request specification
        reqspec = new RequestSpecBuilder().setContentType(ContentType.JSON)
                //.addHeader("Authorizaton", "token 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")
                .setBaseUri("https://petstore.swagger.io/v2/pet")
                .build();

        resp = new ResponseSpecBuilder()
                .expectContentType(ContentType.JSON)
                .expectStatusCode(200)
                .expectResponseTime(lessThan(5000L))
                //.expectBody("status", equalTo("alive"))
                .build();
    }

    @Test(priority = 1)
    public void postRequest(){
        Map<String, Object> reqBody = new HashMap<>();

        reqBody.put("id", 51235);
        reqBody.put("name", "r");
        reqBody.put("status", "alive");

         Response response = given().spec(reqspec).body(reqBody).when().post();

          petId = response.then().extract().path("id");

          response.then().spec(resp).body("name", equalTo("r"));

    }

    @Test(priority = 2)
    public void getRequest(){
        Response response =  given().spec(reqspec).pathParam("petId", petId).get("/{petId}");

        String body = response.getBody().asPrettyString();
        System.out.println(body);

        response.then().spec(resp);
        response.then().spec(resp).body("status", equalTo("alive")).log().headers();

    }

    @Test(priority = 3)
    public void delRequest(){
        Response response = given().spec(reqspec).pathParam("petId", petId)
                .when().delete("/{petId}");

        String body = response.getBody().asPrettyString();
        System.out.println(body);

        response.then().spec(resp).body("message", equalTo(""+petId));


    }
}
