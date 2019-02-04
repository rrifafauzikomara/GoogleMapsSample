package id.eudeka.osg3.googlemapssample.model;


import com.google.gson.annotations.SerializedName;


public class PlusCode{

	@SerializedName("compound_code")
	private String compoundCode;

	@SerializedName("global_code")
	private String globalCode;

	public void setCompoundCode(String compoundCode){
		this.compoundCode = compoundCode;
	}

	public String getCompoundCode(){
		return compoundCode;
	}

	public void setGlobalCode(String globalCode){
		this.globalCode = globalCode;
	}

	public String getGlobalCode(){
		return globalCode;
	}
}