package stepDefinations;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestStepdef {
	
	@Given("when in login page")
	public void when_in_login_page() {
	    System.out.println("test given");
	}
	
	@When("data table to be read")
	public void data_table_to_be_read(DataTable dt) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		System.out.println("test when");
		List<String> l = dt.asList();
	//	Map<String, String>hp = dt.asMap(String, String);
		List<Map<String, String>> hp = dt.asMaps();
		System.out.println("test when--hp  "+hp);
		
		System.out.println("test when--l  "+l);
	
	}
	
	@Then("pass")
	public void pass() {
		System.out.println("test then");
	}
	
	@When("read {string} and {string}")
	public void read_and(String userId, String pwd) {
		System.out.println("user id  -- "+userId);
		System.out.println("pwd   -- "+pwd);
	}
	
	@When("background When")
	public void background_when() {
		System.out.println("BACKGROUND when");
	}
	
	@Given("background given")
	public void background_given() {
		System.out.println("BACKGROUND given");
	}


}
