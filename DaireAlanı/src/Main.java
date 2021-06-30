import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
     Scanner scan=new Scanner(System.in);
     System.out.println("r giriniz:");
    int r=scan.nextInt();
    double pi=3.14;
    System.out.println("merkez açısı:");
    double merkezacısı=scan.nextDouble();
    double alan=(pi*(r*r)*merkezacısı)/360;
        System.out.println("alan:"+alan);


    }
}
