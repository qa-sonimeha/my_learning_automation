package files;

public class payload 
{
	public static String AddPlace()
	{
		return "{\r\n"
				+ "    \"location\": {\r\n"
				+ "        \"lat\": -38.383994,\r\n"
				+ "        \"lng\": 33.427392\r\n"
				+ "    },\r\n"
				+ "    \"accuracy\": 50,\r\n"
				+ "    \"name\": \"<Divala> house\",\r\n"
				+ "    \"phone_number\": \"(+91) 9090909890\",\r\n"
				+ "    \"address\": \"459, Austriat, Delhi\",\r\n"
				+ "    \"types\": [\r\n"
				+ "        \"shoe place\",\r\n"
				+ "        \"shop\"\r\n"
				+ "    ],\r\n"
				+ "    \"website\": \"http://classinc_meha_soni\",\r\n"
				+ "    \"language\": \"French-IN\"\r\n"
				+ "}";
			
	}
	public static String place_id_val()
	{
		return "020f294af4e4f119388aed926365fa8f";
	}
	
	public static String courseStruct()
	{

		System.out.println("custom json function is called here");
		return "{\r\n"
				+ "\r\n"
				+ "\"dashboard\": {\r\n"
				+ "\r\n"
				+ "\"purchaseAmount\": 910,\r\n"
				+ "\r\n"
				+ "\"website\": \"rahulshettyacademy.com\"\r\n"
				+ "\r\n"
				+ "},\r\n"
				+ "\r\n"
				+ "\"courses\": [\r\n"
				+ "\r\n"
				+ "{\r\n"
				+ "\r\n"
				+ "\"title\": \"Selenium Python\",\r\n"
				+ "\r\n"
				+ "\"price\": 50,\r\n"
				+ "\r\n"
				+ "\"copies\": 6\r\n"
				+ "\r\n"
				+ "},\r\n"
				+ "\r\n"
				+ "{\r\n"
				+ "\r\n"
				+ "\"title\": \"Cypress\",\r\n"
				+ "\r\n"
				+ "\"price\": 40,\r\n"
				+ "\r\n"
				+ "\"copies\": 4\r\n"
				+ "\r\n"
				+ "},\r\n"
				+ "\r\n"
				+ "{\r\n"
				+ "\r\n"
				+ "\"title\": \"RPA\",\r\n"
				+ "\r\n"
				+ "\"price\": 45,\r\n"
				+ "\r\n"
				+ "\"copies\": 10\r\n"
				+ "\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "]\r\n"
				+ "\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "";
		
		
	}
}
