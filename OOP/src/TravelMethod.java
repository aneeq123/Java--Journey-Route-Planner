
public class TravelMethod {
	
	City ACity, BCity;  // ACity = Start City, BCity = EndDesCity
	Capital ACapital, BCapital;  // ACapital = StartCapital, BCapital= Finish Capital
	
	
	public TravelMethod() {  //Default Constructor 
	}
	
	
	public TravelMethod(City ACity, City BCity, Capital ACapital, Capital BCapital) {   
		this.ACity = ACity;
		this.BCity = BCity;
		this.ACapital = ACapital;
		this.BCapital = BCapital;
	}
	
	

	
	public void RouteJourney(City ACity, City BCity) {
		if(ACity.cityname==BCity.cityname) {
			
		 	System.out.println(" you are already in " + BCity.cityname + " , so no need to travel" ); 
		}
		else if(ACity.countryname==BCity.countryname) //  Traveling City to City within a country
			System.out.println("Take the bus from " + ACity.cityname + " to " + BCity.cityname );
		
		else if(ACity.cityname== ACity.capitalname && BCity.cityname==BCity.capitalname) // Traveling  from Capital city to  Capital City in another country
			System.out.println(" Fly directly from " + ACity.cityname  + " to " + BCity.cityname );
		
		else if(ACity.cityname== ACity.capitalname && BCity.cityname!=BCity.capitalname) // Traveling from  Capital city to Non Capital  city in another country  
			System.out.println(" Fly from " + ACity.capitalname  + " to " + BCity.capitalname + " and then take the bus to "  + BCity.cityname );
		
		else if(ACity.cityname!= ACity.capitalname && BCity.cityname==BCity.capitalname) // Traveling from Non-Capital city  to Capital in another Country
			System.out.println(" Take the bus from  " + ACity.cityname + " to " + ACity.capitalname + " And then fly  to " + BCity.capitalname );
		else
			System.out.println(" Take the bus from  " + ACity.cityname + " to " + ACity.capitalname + " And fly  to " + BCity.capitalname + " and then take a bus to  " + BCity.cityname  );  // Traveling from Non-Capital city  to  Non-Capital city in another Country
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	}
	

}
