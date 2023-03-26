package petStore;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class POST extends TestBase{
    @Test
    public void test1(){

        String bodyString = "{\n" +
                "  \"id\": \"1\",\n" +
                "  \"name\": \"benekli\"}";

        Map<String, Object> bodyMap = new HashMap<>();
        bodyMap.put("id","1");
        bodyMap.put("name","benekli");


        PET bodyPet = new PET();
        bodyPet.id=1;
        bodyPet.name="benekli";

        Response responseString = given().accept(ContentType.JSON)
                .and().contentType(ContentType.JSON)
                .and().body(bodyString)
                .when().post("https://petstore.swagger.io/v2/pet/");

        responseString.prettyPrint();




    }

}
