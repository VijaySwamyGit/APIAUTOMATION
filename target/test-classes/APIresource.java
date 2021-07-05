
public enum APIresource {
	private String resource;
	
	addPlaceAPI("/maps/api/place/add/json"),
	getPlaceAPI("/maps/api/place/get/json"),
	deletePlaceAPI("/maps/api/place/delete/json");
	
	
	
	APIresource(String resource)
	{
		this.resource=resource;
	}

	public String apiResource()
	{
		return resouce;
	}
}
