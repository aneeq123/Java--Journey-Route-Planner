
public class City   {

	// instance variables
	  String cityname;
	  protected String countryname;
	  String capitalname;
	  private double  population;
	  private String  pointofinterest;
	  
	  
	 public City(String cityname, String countryname, String capitalname, double population, String pointofinterest) {
		 
		this.cityname = cityname;
		this.countryname = countryname;
		this.capitalname = capitalname;
		this.pointofinterest = pointofinterest;
		this.population=population;
		
	}
	 
	 
	 
	 
	  public String getcountryname() {
	        return countryname;
	    }

	    public void setcountryname(String countryname) {
	        this.countryname = countryname;
	    }
	    
	    
		  public String getcityname() {
		        return cityname;
		    }

		    public void setcityname(String cityname) {
		        this.cityname = cityname;
		    }
		    
		    
		    public String getpointofinterest() {
		        return pointofinterest;
		    }

		    public void setpointofinterest(String pointofinterest) {
		        this.pointofinterest = pointofinterest;
		    }
		    
		    
		    
		    public double  getpopulation() {
		        return population;
		    }

		    public void population(double population) {
		        this.population = population;
		    }
		    
		    
		    
		    
		    
		    
		    
		
		   

	 
	
	 

}
