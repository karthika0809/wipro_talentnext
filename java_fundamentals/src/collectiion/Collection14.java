package collectiion;

import java.util.Properties;
import java.util.Iterator;
import java.util.Set;

// Program to store states and capitals in Properties and iterate
public class Collection14 {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("Maharashtra", "Mumbai");
        properties.setProperty("Karnataka", "Bengaluru");
        properties.setProperty("Tamil Nadu", "Chennai");
        
        System.out.println("States and Capitals:");
        Set<String> keys = properties.stringPropertyNames();
        Iterator<String> iterator = keys.iterator();
        while (iterator.hasNext()) {
            String state = iterator.next();
            System.out.println("State: " + state + ", Capital: " + properties.getProperty(state));
        }
    }
}
