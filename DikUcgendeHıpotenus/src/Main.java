import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int a,b;
	double c;
	Scanner scan=new Scanner(System.in);
	System.out.print("a:");
	a= scan.nextInt();
	System.out.print("b:");
	b= scan.nextInt();
	c= Math.sqrt((a*a)+(b*b));
        System.out.println("c:"+c);
	double u=(a+b+c)/2;
	double alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("alan:"+alan);
    }
}
