package resources;

import java.util.ArrayList;

import pojo.AddPlace;
import pojo.Location;

public class TestDataBuild {
	
	public AddPlace addPlacePayload(String name, String language, String address)
	{
	
	AddPlace p = new AddPlace();
	Location l = new Location();
	
    p.setAccuracy(50);
    p.setAddress(address);
    p.setLanguage(language);
    p.setPhone_number("8105025525");
    p.setWebsite("setWebsite");
    p.setName(name);
    
    ArrayList<String> al = new ArrayList<String>();
    al.add("shoe park1");
    al.add("shoe park2");
    
    p.setTypes(al);
   
 
    l.setLat(123.11);
    l.setLng(456.22);
    p.setLocation(l);
    
    return p;
	}
}
