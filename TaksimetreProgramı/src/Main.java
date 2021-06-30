import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double mesafe, tutar, acılıs = 10;
        Scanner scan = new Scanner(System.in);
        System.out.println("Mesafeyi giriniz:");
        mesafe = scan.nextDouble();
        tutar = acılıs + (mesafe * 2.20);
        if (tutar < 20) {
            tutar = 20;
            System.out.println(tutar);
        } else {
            System.out.println("tutar" + tutar);
        }
    }
}
