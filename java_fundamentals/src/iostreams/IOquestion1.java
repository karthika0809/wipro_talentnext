package iostreams;
import java.util.*;
import java.io.FileReader;
public class IOquestion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the file name");
		String filename=in.nextLine();
		System.out.println("Enter the character to be counted");
		char char=in.next().toLowerCase().charAt(0);
		int count=0;
		try(FileReader reader=new FileReader(filename)){
		   int ch;
		   while ((ch = reader.read()) != -1) {
               if (Character.toLowerCase((char) ch) == char) {
                   count++;
               }
           }


		}
		

	}

}
