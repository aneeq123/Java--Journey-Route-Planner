# Java--Journey-Route-Planner


---------------------------------------
Name: Aneeq Bokhari

---------------------------------------

Object Oriented Software Design & Development Project

Programming  a world Atlas with a Journey Planner


List of Java Classes
---------------------
1. Country.java
2. City.java
3. Capital.java  (Subclass of CIty) 
4. TravelMethod.java
5. Tester.java *


Note: No Json file involved in this assigment.
------------------------------
Tester.java (Run the Program)
------------------------------


I created the objects and entered each instances manually.
Created the LInkedlist for Country and City.
Added the objects for each linkedlist(Country and City).
Added each Hashmap for Country and City. Basically this interface converts large String into Small String that shows the same String.For example, in my program, when you want to search Country, 'Ireland', there is no need to type in capital letter. Just simply type 'ireland' and will search the instance quickly.


Next part, is to display the world atlas options. First I used Scanner class to get user input. This will allow user to enter any details using the world atlas program. At the start of the program, user will have 5 choice to select any options that he/she is interested.

Click run and it will run this program. 

1. List of Countries- When an user type 1 (integer), it will display the list of countries. 

2. Journey Route Planner-  When an user type  2 (integer), this will bring the Journey Route planner option. The Journey route planner tell the user how to travel from city to city. The code was implemented in the 'TravelMethod.java'. The user will be prompted to type the city that he/she is located. and then it will display the next line showing what city they like to travel. Depending the the cities that user typed, it will show the journey plan of how to travel from one city to another. For example, if I travel from Galway to Dublin.Because both cities are within a country. You get the bus from Galway to Dublin.
Another example is when travelling from one city to another city of another country(for e.g, galway to lyon). The possible route is to take the bus from city to captial city  within the country, then take the flight from captital city to capital city of another country then finally take the bus from capital city to city in that country.
For this Program, I only used the plane and the bus functionalities.


3.  Country Information-  When an user type  3 (integer), this will bring the Country information option. User can type any country and will display the information about it such as Capital city of the country, population of the country and the neighboring country.

4.  City Information-  When an user type  4 (integer), this will bring the City information option. User can type any city name and will display the information about it such as   population of the city, the point of interest of the city and the  countryname where the city is belong.

5. Exit- When an user type  5 (integer), the program will be terminated and stopped. 
