package petStore;

import org.junit.jupiter.api.BeforeAll;

import static io.restassured.RestAssured.baseURI;

public class TestBase {
    @BeforeAll
    public static void setUp(){
        baseURI = "https://petstore.swagger.io/v2/";
    }
}
