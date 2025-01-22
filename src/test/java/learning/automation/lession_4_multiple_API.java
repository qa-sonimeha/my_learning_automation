package learning.automation;
import io.restassured.*;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;

import files.payload;
import files.payload.*;

//Will be using PUT API to update the phone number field

// End-to-End testing 

public class lession_4_multiple_API 

{
		public static void main(String args[])
		{
			// Put API to add new Place
			
		/*	RestAssured.baseURI="http://rahulshettyacademy.com";
			String response=given().log().all().queryParam("key","qaclick123").header("Content-Type","application/json")
			.body("{\r\n"
					+ "    \"place_id\": \"020f294af4e4f119388aed926365fa8f\",\r\n"
					+ "    \"address\": \"70 winter walk, USA\",\r\n"
					+ "    \"key\": \"qaclick123\"\r\n"
					+ "}")
			.when().put("maps/api/place/update/json")
			.then().log().all().assertThat().statusCode(200).body("msg", equalTo("Address successfully updated")).extract().asString();
			*/
			
			
			
		}
}
