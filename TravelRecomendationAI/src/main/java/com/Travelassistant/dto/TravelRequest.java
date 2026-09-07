package com.Travelassistant.dto;

public class TravelRequest {

	private String placeType;
	private double budget;
	private int days;
	private String travelMonth;
	private int travellers;
	private String departureCity;
	
	
	public TravelRequest() {
		
	}


	public TravelRequest(String placeType, double budget, int days, String travelMonth, int travellers,
			String departureCity) {
		this.placeType = placeType;
		this.budget = budget;
		this.days = days;
		this.travelMonth = travelMonth;
		this.travellers = travellers;
		this.departureCity = departureCity;
	}


	public String getPlaceType() {
		return placeType;
	}


	public void setPlaceType(String placeType) {
		this.placeType = placeType;
	}


	public double getBudget() {
		return budget;
	}


	public void setBudget(double budget) {
		this.budget = budget;
	}


	public int getDays() {
		return days;
	}


	public void setDays(int days) {
		this.days = days;
	}


	public String getTravelMonth() {
		return travelMonth;
	}


	public void setTravelMonth(String travelMonth) {
		this.travelMonth = travelMonth;
	}


	public int getTravellers() {
		return travellers;
	}


	public void setTravellers(int travellers) {
		this.travellers = travellers;
	}


	public String getDepartureCity() {
		return departureCity;
	}


	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}
	
	
	
}
