package com.studentapp.studentinfo;

import com.studentapp.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

//import javax.xml.ws.Response;

import static io.restassured.RestAssured.given;

public class StudentDeleteTest extends TestBase {

    @Test
    public void deletestudent(){
        Response response = given().log().all()
                .when()
                .delete("/50");
        response.then().log().all().statusCode(202);
        response.prettyPrint();

    }
}
