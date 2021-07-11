import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
	int number=scan.nextInt();
	int basValue;
	int basNumber=0;
	int result=0;
	int tempnumber=number;
	while(tempnumber !=0){
	    tempnumber/=10;
	    basNumber++;
    }
	tempnumber=number;
	while(tempnumber !=0){
	   basValue=tempnumber%10 ;
	   result+=basValue;
	   tempnumber/=10;
    }
        System.out.println(result);
    }
}
