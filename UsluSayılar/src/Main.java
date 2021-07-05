import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int a;
	int b;
	int c=1;
	Scanner scan=new Scanner(System.in);
        System.out.println("alttaki sayı:");
        a=scan.nextInt();
        System.out.println("üs:");
        b=scan.nextInt();
        for(int i=1;i<=b;i++){
          c*=a;
        }
        System.out.println(c);
    }
}
