package id.eudeka.osg3.googlemapssample.model;

import com.google.gson.annotations.SerializedName;


public class OpeningHours{

	@SerializedName("open_now")
	private boolean openNow;

	public void setOpenNow(boolean openNow){
		this.openNow = openNow;
	}

	public boolean isOpenNow(){
		return openNow;
	}
}