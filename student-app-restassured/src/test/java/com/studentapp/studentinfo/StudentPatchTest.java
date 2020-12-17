package com.studentapp.studentinfo;

import com.studentapp.model.StudentPojo;
import com.studentapp.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

//import javax.xml.ws.Response;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class StudentPatchTest extends TestBase {
    //Homework

    @Test
    public void patchStudent(){

        StudentPojo studentPojo = new StudentPojo();

        studentPojo.setEmail("farma@gmail.com");

        Response response = given().log().all()
                .header("Content-Type", "application/json")
                .when()
                .body(studentPojo)
                .patch("/10");
        response.then().log().all().statusCode(200);
        response.prettyPrint();
    }


}
