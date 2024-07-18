import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Before;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
public class RestAssuredGetAllureTest {
    String bearerToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NjU5ZDJlODM4YTU1YjAwM2Q2MWMxMmEiLCJpYXQiOjE3MjEwMjgwMDEsImV4cCI6MTcyMTYzMjgwMX0.GndQO7lgLcP4ryyPa83y5PwEhhXtyQCzumTOFNjPvGQ";

    @Before
    public void setUp() {
        RestAssured.baseURI = "https://qa-scooter.praktikum-services.ru";
    }

    @Test
    public void getMyInfoStatusCode() {
        given()
                .auth().oauth2(bearerToken)
                .post("/api/v1/courier/login")
                .then().statusCode(200);
    }

    @Test
    public void checkUserName() {
        given()
                .auth().oauth2(bearerToken)
                .post("/api/v1/courier/login")
                .then().assertThat().body("id",equalTo("350464"));
    }

    @Test
    public void checkUserNameAndPrintResponseBody() {
        Response response =given().auth().oauth2(bearerToken).get("/api/v1/courier/login");
        response.then().assertThat().body("id",equalTo("350464"));
        System.out.println(response.body().asString());

    }

}
