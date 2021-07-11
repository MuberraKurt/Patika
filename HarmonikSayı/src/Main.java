import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
        System.out.println("Sayı:");
        double n=scan.nextInt();
        double result=0;
        while(n>0){
            result=result+(1/n);
            n--;
        }
        System.out.println(result);
    }
}
