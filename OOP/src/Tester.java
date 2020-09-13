import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Tester {


	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);  // Scanner Input
		
		
		
		
		
		// LinkedList for country
		LinkedList<Country> MyCountries = new LinkedList<Country>();

		// country Objects
		// (Country, Capital,City,Population, Bording Countries)
		
		Country Germany = new Country("Germany", "Berlin", "Munich", 54.79, "Holland");
		Country France = new Country("France", "Paris","Lyon", 54.79, "Spain");
		Country Spain = new Country("Spain", "Madrid","Barcelona", 54.79, "France");
		Country Ireland = new Country("Ireland", "Dublin", "Galway",54.79, "UK");
		Country Holland = new Country("Holland", "Amsterdam","Rotterdam",  54.79, "Germany");
		Country Portugal = new Country("Portugal", "Lisbon","Porto", 54.79, "Spain");
		Country Belguim = new Country("Belguim", "Brussels","Antwerp", 54.79, "Holland");
		Country Russia = new Country("Russia", "Moscow","StPetersbough", 54.79, "Poland");
		Country Italy = new Country("Italy", "Rome", "Milan", 54.79,"France");
		Country UK = new Country("Uk", "London","Manchester", 54.79, "Ireland");
		Country Poland = new Country("Poland", "Warsaw","Krakow", 54.79, "Russia");
		Country Switzerland = new Country("Switzerland", "Bern","Zurich", 54.79, "Italy");
		
		// Adding each Country object to the linkedList
		
		MyCountries.add(Germany);
		MyCountries.add(France);
		MyCountries.add(Spain);
		MyCountries.add(UK);
		MyCountries.add(Holland);
		MyCountries.add(Russia);
		MyCountries.add(Portugal);
		MyCountries.add(Belguim);
		MyCountries.add(Italy);
		MyCountries.add(Ireland);
		MyCountries.add(Poland);
		MyCountries.add(Switzerland);
			
		
		
		// Hashmap list for Country
		HashMap<String, Country> CountryMap = new HashMap<String, Country>();
		CountryMap.put("germany", Germany);
		CountryMap.put("france", France);
		CountryMap.put("spain", Spain);
		CountryMap.put("ireland", Ireland);
		CountryMap.put("holland", Holland);
		CountryMap.put("portugal", Portugal);
		CountryMap.put("belguim", Belguim);
		CountryMap.put("italy", Italy);
		CountryMap.put("ireland", Ireland);
		CountryMap.put("switzerland", Switzerland);
		CountryMap.put("poland", Poland);

		
		
		// LinkedList for City
		LinkedList<City> MyCities = new LinkedList<City>();

		// City Objects
		// (cityname, countryyname, Capitalname, population, pointofinterest)
		
		City Munich = new City("Munich", "Germany", "Berlin", 4.786, "Alianz Arena");
		City Lyon = new City("Lyon", "France", "Paris", 513275, "Place des Terreaux");
		City Barcelona = new City("Barcelona", "Spain", "Madrid", 1620809, "Nou Camp");
		City Galway = new City("Galway", "Ireland", "Dublin", 79934, "Spanish Arch");
		City Rotterdam = new City("Rotterdam", "Holland", "Amsterdam", 635389, "The Destroyed City");
		City Porto = new City("Porto", "Portugal", "Lisbon", 237591, "Estadio Dragao");
		City Antwerp = new City("Antwerp", "Belguim", "Brussels", 520504, "Museum aan de Stroom");
		City StPetersbough = new City("StPetersbough", "Russia", "Moscow", 5351935, "Peter and Paul Fortress");
		City Milan = new City("Milan", "Italy", "Rome", 1372810, "San siro");
		City Manchester = new City("Manchester", "UK", "London", 545500, "Trafford Centre");
		City Krakow = new City("Krakow", "Poland", "Warsaw", 765320 , "Main Square");
		City Zurich = new City("Zurich", "Switzerland", "Bern", 409241, "Fraumunster");
		
		City Berlin = new Capital("Berlin", "Germany", "Berlin",  3748148 , "Berlin Wall");
		City Paris = new Capital("Paris", "France", "Paris", 2140526, "Effiel Tower");
		City Madrid = new Capital("Madrid", "Spain", "Madrid", 3223334, "Santiago Benabaeu");
		City Dublin = new Capital("Dublin", "Ireland", "Dublin", 554554, "Dublin Zoo");
		City Amsterdam = new Capital("Amsterdam", "Holland", "Amsterdam", 	854047, "Amsterdam Arena");
		City Lisbon = new Capital("Lisbon", "Portugal", "Lisbon", 505526, "Eduardo VII Park");
		City Brussels = new Capital("Brussels", "Belguim", "Brussels", 	1191604, "Brussels Town Hall");
		City Moscow = new Capital("Moscow", "Russia", "Moscow", 12506468, "Red Square");
		City Rome = new Capital("Rome", "Italy", "Rome", 4355725, " Colloseum");
		City London = new Capital("London", "UK", "London", 9126366, "Wembley Stadium");
		City Warsaw = new Capital("Warsaw", "Poland", "Warsaw", 1764615 , "Lazienki Park");
		City Bern = new Capital("Bern", "Switerland", "Bern", 133798, "Old City");
		
		
		
	
		// Adding each City object to the linkedList
		
		MyCities.add(Munich);
		MyCities.add(Lyon);
		MyCities.add(Barcelona);
		MyCities.add(Galway);
		MyCities.add(Milan);
		MyCities.add(Manchester);
		MyCities.add(Porto);
		MyCities.add(StPetersbough);
		MyCities.add(Antwerp);
		MyCities.add(Rotterdam);
		MyCities.add(Berlin);
		MyCities.add(Paris);
		MyCities.add(Dublin);
		MyCities.add(Moscow);
		MyCities.add(Rome);
		MyCities.add(Lisbon);
		MyCities.add(London);
		MyCities.add(Brussels);
		MyCities.add(Madrid);
		MyCities.add(Amsterdam);
		MyCities.add(Bern);
		MyCities.add(Krakow);

	

		// Hashmap list for City
		
		HashMap<String, City> CityMap = new HashMap<String, City>();
		CityMap.put("munich", Munich);
		CityMap.put("lyon", Lyon);
		CityMap.put("barcelona", Barcelona);
		CityMap.put("galway", Galway);
		CityMap.put("rotterdam", Rotterdam);
		CityMap.put("milan", Milan);
		CityMap.put("manchester", Manchester);
		CityMap.put("porto", Porto);
		CityMap.put("antwerp", Antwerp);
		
		CityMap.put("dublin", Dublin);
		CityMap.put("moscow", Moscow);
		CityMap.put("berlin", Berlin);
		CityMap.put("paris", Paris);
		CityMap.put("lisbon", Lisbon);
		CityMap.put("london", London);
		CityMap.put("brussels", Brussels);
		CityMap.put("madrid", Madrid);
		CityMap.put("amsterdam", Amsterdam);
		CityMap.put("rome", Rome);		
		CityMap.put("bern", Bern);	
		CityMap.put("krakow", Krakow);	

		
		
		// Calling the TravelMethod class//
		City ACity = null, BCity = null;
		TravelMethod SF = new TravelMethod(ACity, BCity, null, null);

		///// User Input ///////
		
		// Declare variables
		int choice; // the user's choice in the menu //

		do { // This will repeat the program

			// print the menu
			System.out.println("Welcome to the World Atlas ");
			
			System.out.println("");
			
			System.out.println("Type any number to select the option:");
			
			System.out.println("");
			
			System.out.println("1. List of Countries");
			System.out.println("2. Journey Route Planner");
			System.out.println("3. Country information");
			System.out.println("4. City information");

			System.out.println("5.Exit");
			System.out.println("");
			System.out.println("Choice:");
			
			String tempstart ="";
			String tempend ="";
			choice = input.nextInt();

			if (choice != 5) {

				if (choice == 1) {
					System.out.println("Show the List of Countries:");
					System.out.println("");
					System.out.println(MyCountries.toString()); // Display the list of countries
					System.out.println("");
				}

				if (choice == 2) {
					
					System.out.println("Which city are you located?");
					tempstart = input.next().toLowerCase();
					
					System.out.println("City you like to travel?");
					 tempend = input.next().toLowerCase();
					 
					 System.out.println("");
						
					if(CityMap.containsKey(tempstart)&&CityMap.containsKey(tempend)) {
						City begin = CityMap.get(tempstart);
						City dest = CityMap.get(tempend);
			
						SF.RouteJourney(begin, dest);
						System.out.println();}
						else System.out.println("Error");
					
				}
				
				
	if (choice == 3) {
					
		System.out.println("Type the name of the country");
		String cty = input.next().toLowerCase();
		if(CountryMap.containsKey(cty)) {
		
		System.out.println(" The Capital city: " + CountryMap.get(cty).getcapitalname()); // Display the capital city of the country
		System.out.println(" CityName: " + CountryMap.get(cty).getcityname()); // Display the  City name of the country
		System.out.println(" Population: " + CountryMap.get(cty).getpopulation()); // Display the Population
		System.out.println(" Border Country: " + CountryMap.get(cty).getbordercountryname()); // // Display the neighbouring country
		}
		
				
					
				}
	
	
	if (choice == 4) {
		
		System.out.println("Type the name of the city");
		String city = input.next().toLowerCase();
		if(CityMap.containsKey(city)) {
		
		System.out.println(" Population: " + CityMap.get(city).getpopulation()); // Display the population of the city
		System.out.println(" Tourist Attraction: " + CityMap.get(city).getpointofinterest()); // Display the point of interest of the city
		System.out.println(" Country: " + CityMap.get(city).getcountryname()); // Display the country name
		}
		
				
					
				}
	
	

		
				
					
				}

						
					
										
				

			 // end if loop

			else {
				System.out.println("Program Terminated "); // Display "Program terminated" if user enter 3

			} // end else loop

		} // end do loop

		while (choice != 5);
		
				
			

		}   // End main class
	
	


		



	
	



}
