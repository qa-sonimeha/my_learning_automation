package learning.automation;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;  
import static org.hamcrest.Matchers.*; 
// import files.payload;
// we are keeping it static throughout the execution of this class

public class lession_3_Get_api 
	{
	
	public static void main(String args[])
	{
	// Given - input and pass queryParam
	// when - submit API with http method 
	//then - assert that validate response
	
	RestAssured.baseURI=	"https://rahulshettyacademy.com";

String response=given().log().all().queryParam("key", "qaclick123").queryParam("place_id", "020f294af4e4f119388aed926365fa8f")
.when().get("maps/api/place/get/json")
.then().log().all().assertThat().statusCode(200).body("scope", equalTo("APP"))
.header("server", "Apache/2.4.52 (Ubuntu)").extract().response().asString();


JsonPath js= new JsonPath(response);
String loc_lat=js.getString("location.latitude");
String loc_long=js.getString("location.longitude");
String adres = js.getString("address");
String phn=js.getString("phone_number");





System.out.print("Values from GET API are as below;");

System.out.print("Latitude");
System.out.println(loc_lat);

System.out.print("Longitude");
System.out.println(loc_long);

System.out.print("Address");
System.out.println(adres);

System.out.print("Phone#");
System.out.println(phn);


	
	}
	//given().log().all().queryParam("key", "qaclick123", "place_id", "020f294af4e4f119388aed926365fa8f")
	

	}
