package utilities;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import static io.restassured.RestAssured.*;


public class SpartanNewBase {
    @BeforeAll
    public static void init(){

        //save baseurl inside this variable so that we dont need to type each http method.
        baseURI = "http://44.202.105.211";
        port = 7000;
        basePath ="/api";
    }
}
