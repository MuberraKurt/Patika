import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
        System.out.println("Enter year:");
        int year=scan.nextInt();
     if (year%4==0){
         System.out.println(year+ " is a leap year!");
     }else if(year%100==0 && year%400==0){
         System.out.println(year+" is a leap year!");
     }else{
         System.out.println(year+ " is NOT a leap year...");
     }
    }
}
