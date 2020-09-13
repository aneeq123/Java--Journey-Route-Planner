import java.io.Serializable;
import java.util.Scanner;

public class Country   {

	

	static Scanner input = new Scanner(System.in);

	// instance variables
	private String countryname;
	private String capitalname;
	private String cityname;
	private double population;
	private String bordercountryname;

	City city; // composition
	
	


	public Country() { //Default Constructor
	}

	public Country(String countryname, String capitalname, String cityname,  double population, String bordercountryname) {
		this.countryname = countryname;
		this.capitalname = capitalname;
		this.cityname = cityname;
		this.population = population;
		this.bordercountryname= bordercountryname;
	}

	public String getcountryname() {
		return countryname;
	}

	public void setcountryname(String countryname) {
		this.countryname = countryname;
	}
	

	public String getcapitalname() {
		return capitalname;
	}

	public void setcapitalname(String capitalname) {
		this.capitalname = capitalname;
	}
	
	
	public String getbordercountryname() {
		return bordercountryname;
	}

	public void setbordercountryname(String bordercountryname) {
		this.bordercountryname = bordercountryname;
	}
	
	
	
	

	public double getpopulation() {
		return population;
	}

	public void setpopulation(double population) {
		this.population = population;
	}
	
	public  String getcityname() {
		return cityname;
	}

	public void setcityname(String cityname) {
		this.cityname = cityname;
	}
	

	
	@Override
	public String toString() {
		return "Country [countryname=" + countryname + ", capitalname=" + capitalname + ", cityname=" + cityname
				+ ", population=" + population + ", bordercountryname=" + bordercountryname + ", city=" + city + "]";
	}
	
	
	
	
	
	


}
