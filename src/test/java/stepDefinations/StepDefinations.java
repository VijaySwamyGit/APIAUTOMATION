package stepDefinations;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import resources.TestDataBuild;
import utilities.Utility;

public class StepDefinations extends Utility{
	RequestSpecification reqspecResponse; 
	//ResponseSpecification resspec;
	Response response;
	
	TestDataBuild tdb = new TestDataBuild();

	
	@Given("Add place payload with {string} {string} {string}")
	public void add_place_payload_with(String name, String language, String address) throws IOException 
	{   
 
		//getting response after build request specification which	
		//will be stored in RequestSpecification reference(from RequestSpecBuilder object)
		reqspecResponse =given().spec(requestSpecification()).body(tdb.addPlacePayload(name,language,address));   		
    
	}

	@When("user calls {string} with http request")
	public void user_calls_with_http_request(String resource) throws IOException
	{
	 
		//APIresource apiResource = new APIresource().valueOf(resource);
		
			String response =reqspecResponse.when().post("/maps/api/place/add/json").
	    		then().spec(responseSpecification()).extract().response().asString();
	    	//	String responseString=response.asString();
	    		//System.out.println(responseString);
}

@Then("API call got success with status code {int}")
public void a_pi_call_got_success_with_status_code(int statusCode) 
{
	 assertEquals(response.getStatusCode(), statusCode);
}

@Then("{string} in response body is {string}")
public void in_response_body_is(String extractor_path, String expectedValue)
{
	 String responseString=response.asString();
	 String ActualValue = Utility.rawToJson(responseString, extractor_path);
	 assertEquals(ActualValue,expectedValue);
}


}
