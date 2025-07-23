package collectiion;

interface WordCount {
    int count(String str);
}

// Program to count words using lambda
public class Collection21 {
    public static void main(String[] args) {
        // Implement WordCount using lambda
        WordCount wordCount = str -> str.trim().isEmpty() ? 0 : str.trim().split("\\s+").length;
        
        // Test cases
        String test1 = "Hello World";
        String test2 = "Java Programming is Fun";
        System.out.println("Word count for \"" + test1 + "\": " + wordCount.count(test1));
        System.out.println("Word count for \"" + test2 + "\": " + wordCount.count(test2));
    }
}
