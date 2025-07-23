package collectiion;

import java.util.HashSet;

//Class to manage country names in a HashSet
public class Collection8 {
 private HashSet<String> H1 = new HashSet<>();
 
 public HashSet<String> saveCountryNames(String countryName) {
     H1.add(countryName);
     return H1;
 }
 
 public String getCountry(String countryName) {
     return H1.contains(countryName) ? countryName : null;
 }
 
 public static void main(String[] args) {
     Collection8 set = new Collection8();
     
     // Test saveCountryNames
     set.saveCountryNames("India");
     set.saveCountryNames("Japan");
     System.out.println("HashSet after adding countries: " + set.H1);
     
     // Test getCountry
     System.out.println("Get India: " + set.getCountry("India"));
     System.out.println("Get Brazil: " + set.getCountry("Brazil"));
 }
}