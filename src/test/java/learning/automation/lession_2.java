package learning.automation;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import files.payload;

public class lession_2 {

	public static void main(String[] args) {
		// TODO Creating First REST Assured Script for
		// Add Place and validating its response
		// Given - to input all details in API
		// When - to submit API with httpmethod & Resource
		//Then - to validate the Response Code with Assertthat
		
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		String response=given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
		.body(payload.AddPlace()).when().post("maps/api/place/add/json")
		//.then().log().all().assertThat().statusCode(200);		
		//above validating the response status code
		/*-----------------------------check for other response in then() method----------------------------------------------------------- */
		.then().log().all().assertThat().statusCode(200).body("scope", equalTo("APP"))
		.header("server", "Apache/2.4.52 (Ubuntu)").extract().response().asString();
		
		//Capturing the Json path
		JsonPath js=new JsonPath(response);
		String place_id=	js.getString("place_id");
		String scope_d=	js.getString("scope");
		String ref_d=	js.getString("reference");
			
		System.out.println(place_id);
		System.out.println(ref_d);
		System.out.println(scope_d);
		
		//
System.out.println(response);
	}

}
