package id.eudeka.osg3.googlemapssample.model;


import com.google.gson.annotations.SerializedName;


public class Viewport{

	@SerializedName("southwest")
	private Southwest southwest;

	@SerializedName("northeast")
	private Northeast northeast;

	public void setSouthwest(Southwest southwest){
		this.southwest = southwest;
	}

	public Southwest getSouthwest(){
		return southwest;
	}

	public void setNortheast(Northeast northeast){
		this.northeast = northeast;
	}

	public Northeast getNortheast(){
		return northeast;
	}
}