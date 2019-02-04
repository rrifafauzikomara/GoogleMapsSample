package id.eudeka.osg3.googlemapssample.model;

import com.google.gson.annotations.SerializedName;


public class Geometry{

	@SerializedName("viewport")
	private Viewport viewport;

	@SerializedName("location")
	private Location location;

	public void setViewport(Viewport viewport){
		this.viewport = viewport;
	}

	public Viewport getViewport(){
		return viewport;
	}

	public void setLocation(Location location){
		this.location = location;
	}

	public Location getLocation(){
		return location;
	}
}