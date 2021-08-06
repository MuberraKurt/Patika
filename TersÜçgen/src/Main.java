import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int digit,num;
        System.out.println("Basamak sayısı giriniz:");
        digit=scan.nextInt();
    num=(2*digit)-1;
    for(int i=1;i<=digit;i++) {
        for(int j=0;j<=i;j++){
            System.out.print(" ");
        }
        for (int j =(2*digit)-1; j >= (2*i+1); j--) {
            System.out.print("*");
        }
        System.out.println();
    }
    }
}
