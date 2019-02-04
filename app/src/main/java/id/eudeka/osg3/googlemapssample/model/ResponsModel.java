package id.eudeka.osg3.googlemapssample.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;


public class ResponsModel {

	@SerializedName("html_attributions")
	private List<Object> htmlAttributions;

	@SerializedName("results")
	private List<ResultsItem> results;

	@SerializedName("status")
	private String status;

	public void setHtmlAttributions(List<Object> htmlAttributions){
		this.htmlAttributions = htmlAttributions;
	}

	public List<Object> getHtmlAttributions(){
		return htmlAttributions;
	}

	public void setResults(List<ResultsItem> results){
		this.results = results;
	}

	public List<ResultsItem> getResults(){
		return results;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}
}