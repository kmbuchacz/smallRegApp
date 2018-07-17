package SmallRegApp;

import java.util.LinkedHashMap;

public class Student {
	
	private String firstName;
	private String secondName;
	private String country;
	private String favoriteLanguage;
	private String [] knownLanguages;
	private LinkedHashMap <String, String > countryList;
	
	
	public LinkedHashMap<String, String> getCountryList() {
		return countryList;
	}

	public  Student() {
		countryList = new LinkedHashMap<>();
		
		countryList.put("Fr", "France");
		countryList.put("De", "Deutschland");
		countryList.put("UK", "Ukraine");
		countryList.put("LIT", "Lituea");
		countryList.put("Fr", "France");
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public String[] getKnownLanguages() {
		return knownLanguages;
	}

	public void setKnownLanguages(String[] knownLanguages) {
		this.knownLanguages = knownLanguages;
	}

}
