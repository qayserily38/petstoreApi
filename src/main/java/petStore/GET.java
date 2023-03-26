package petStore;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class GET extends TestBase{
    @Test
    public void test1() {

        Response response = given().accept(ContentType.JSON)
                .when().get("https://petstore.swagger.io/v2/pet/1");

        System.out.println(response.statusCode());
        Assertions.assertEquals(200, response.statusCode());
        Assertions.assertTrue(response.headers().exist());
        Assertions.assertEquals("application/json", response.header("Content-Type"));

        response.prettyPrint();


    }

    @Test
    public void test2() {

        Response response = given().accept(ContentType.JSON)
                .when().get("https://petstore.swagger.io/v2/pet/1");

        System.out.println(response.statusCode());
        Assertions.assertEquals(404, response.statusCode());
        Assertions.assertTrue(response.headers().exist());
        Assertions.assertEquals("application/json", response.header("Content-Type"));

    }


}
