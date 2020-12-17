package com.studentapp.studentinfo;

import com.studentapp.model.StudentPojo;
import com.studentapp.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

//import javax.xml.ws.Response;
import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class StudentPutTest extends TestBase {
    // Homework
    @Test
    public void pustStudent() {

        List<String> courses = new ArrayList<>();
        courses.add("Swimming");
        courses.add("Biochemistry");
        courses.add("Genetics");
        courses.add( "Cricket.");


        StudentPojo studentPojo = new StudentPojo();
        studentPojo.setFirstName("Sebastian");
        studentPojo.setLatName("Siera");
        studentPojo.setEmail("faucibus@sed.co.uk");
        studentPojo.setProgramme("API Testing");
        studentPojo.setCourses(courses);


        Response response = given().log().all()
                .header("Content-Type", "application/json")
                .when()
                .body(studentPojo)
                .put("/9");
        response.then().log().all().statusCode(200);
        response.prettyPrint();
    }
}
