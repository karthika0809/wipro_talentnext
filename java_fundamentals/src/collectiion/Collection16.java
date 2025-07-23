package collectiion;

import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Map;

// Class to manage country-capital pairs in TreeMap
public class Collection16 {
    private TreeMap<String, String> M1 = new TreeMap<>();
    
    public TreeMap<String, String> saveCountryCapital(String countryName, String capital) {
        M1.put(countryName, capital);
        return M1;
    }
    
    public String getCapital(String countryName) {
        return M1.get(countryName);
    }
    
    public String getCountry(String capitalName) {
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            if (entry.getValue().equals(capitalName)) {
                return entry.getKey();
            }
        }
        return null;
    }
    
    public TreeMap<String, String> swapKeyValue() {
        TreeMap<String, String> M2 = new TreeMap<>();
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            M2.put(entry.getValue(), entry.getKey());
        }
        return M2;
    }
    
    public ArrayList<String> getCountryList() {
        return new ArrayList<>(M1.keySet());
    }
    
    public static void main(String[] args) {
        Collection16 map = new Collection16();
        
        // Test saveCountryCapital
        map.saveCountryCapital("India", "Delhi");
        map.saveCountryCapital("Japan", "Tokyo");
        System.out.println("M1: " + map.M1);
        
        // Test getCapital
        System.out.println("Capital of India: " + map.getCapital("India"));
        
        // Test getCountry
        System.out.println("Country for Delhi: " + map.getCountry("Delhi"));
        
        // Test swapKeyValue
        System.out.println("M2 (Capital to Country): " + map.swapKeyValue());
        
        // Test getCountryList
        System.out.println("Country List: " + map.getCountryList());
    }
}