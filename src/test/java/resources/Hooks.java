package resources;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before("@Smoke")
	public void beforeM()
	{
		System.out.println("hook beforeM");
	}
	@After("@Smoke")
	public void afterM()
	{
		System.out.println("hook afterM");
	}

}
