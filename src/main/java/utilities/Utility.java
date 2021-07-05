package utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

//import com.jayway.jsonpath.JsonPath;

//import io.restassured.path.json.JsonPath;


public  class Utility {
	

	public static String globalProperties(String url) throws IOException
	{
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream("E:\\API-AUTOMATION-E2E\\API_AUTOMATION_2\\src\\test\\resources\\globalProperties");
		p.load(fis);
		return p.getProperty(url);
		
	}
	
public static String rawToJson(String rawString,String extractorPath)
{
	JsonPath js1 = new JsonPath(rawString);
	String jsonValue = js1.getString(extractorPath);
			return jsonValue;
}
public static RequestSpecification reqspec;
public RequestSpecification requestSpecification() throws IOException
{
	
	if(reqspec==null)//to avoid log replacement
	{
	PrintStream log = new PrintStream(new FileOutputStream("logging.txt"));
	RequestSpecification reqspec =new RequestSpecBuilder().setBaseUri(globalProperties("baseUrl")).addQueryParam("key", "qaclick123")
    		   		.addFilter(RequestLoggingFilter.logRequestTo(log))
    		   		.addFilter(ResponseLoggingFilter.logResponseTo(log))
    		   		.setContentType(ContentType.JSON).build();
    
       return reqspec;
	}
	return reqspec;
}

public ResponseSpecification responseSpecification() throws IOException
{
		
	ResponseSpecification resspec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
    
       return resspec;
}

}
