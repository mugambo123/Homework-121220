package com.studentapp.studentinfo;

import com.studentapp.model.StudentPojo;
import com.studentapp.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class StudentPostTest extends TestBase {

    @Test
    public void createStudent(){

        List<String> courses = new ArrayList<>();
        courses.add("Java");
        courses.add("API");

        StudentPojo studentPojo = new StudentPojo();
        studentPojo.setFirstName("rolon");
        studentPojo.setLatName("musk");
        studentPojo.setEmail("Elon123@gmail.com");
        studentPojo.setProgramme("API Testing");
        studentPojo.setCourses(courses);

        Response response = given().log().all()
                .header("Content-Type", "application/json")
                .when()
                .body(studentPojo)
                .post();
        response.then().log().all().statusCode(201);
        response.prettyPrint();
    }
}
