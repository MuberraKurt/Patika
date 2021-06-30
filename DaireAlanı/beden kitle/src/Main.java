import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("1 km yakılan miktar");
        Scanner scan= new Scanner(System.in);
        double yakılan=scan.nextDouble();
        System.out.println("kaç km gittin");
        double km=scan.nextDouble();
        double bki=km*yakılan;
        System.out.println("BKİ=" +bki);

    }
}
