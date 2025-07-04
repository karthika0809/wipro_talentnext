package java_fundamentals;

import java.util.Scanner;

public class Question11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Month number");
        int mno=scanner.nextInt();

        String mName;

        switch (mno) {
            case 1:
                mName = "January";
                break;
            case 2:
                mName = "February";
                break;
            case 3:
                mName = "March";
                break;
            case 4:
                mName = "April";
                break;
            case 5:
                mName = "May";
                break;
            case 6:
               mName = "June";
                break;
            case 7:
                mName = "July";
                break;
            case 8:
                mName = "August";
                break;
            case 9:
                mName = "September";
                break;
                
            case 10:
                mName = "October";
                break;
            case 11:
                mName = "November";
                break;
            case 12:
                mName = "December";
                break;
                
            default:
                mName = "Invalid Code";
        }

        System.out.println(mName);

        scanner.close();
    }
}
