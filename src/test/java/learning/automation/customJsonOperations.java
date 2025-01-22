package learning.automation;

import io.restassured.RestAssured;
import  io.restassured.path.json.JsonPath;
import files.payload;


public class customJsonOperations {

	public static void main(String[] args) 
	{
		//  Perform operation on json Array 
		String response= new String(payload.courseStruct());
		// Call JsonPath here
		JsonPath js= new JsonPath(response);
		//Extract the values from the JsonPath Array display all titles of all courses + count size of courses array
				
		int count= js.getInt("courses.size()");
		
		for(int i=0; i<count ; i++)
		{
			// print the title's of courses 
			String coursesTitle=js.get("courses["+i+"].title");
			System.out.println("Name:   "+coursesTitle+  "Price :  "+ js.getInt("courses["+i+"].price"));
			
			//
			
		}

	}

}
