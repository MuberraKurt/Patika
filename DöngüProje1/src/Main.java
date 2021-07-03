import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Limiti giriniz n:");
        int n = scan.nextInt();
        int toplam = 0;
        int counter = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0 || i % 4 == 0) {
                toplam += i;
                counter++;
                System.out.println(i);
                System.out.println("Toplam:" + toplam);

            }
        }
        if (counter != 0) {
            double ortalama = toplam / counter;
            System.out.println("Ortalama:" + ortalama);
        }
    }
}


