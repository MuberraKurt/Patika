import java.util.ArrayList;
import java.util.Scanner;

public class Main {
//**notları arrayliste ekle for döngüsü içinde array içindekileri topla //
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your math grade:");
        int math = scan.nextInt();
        System.out.println("Enter your physics grade:");
        int physics = scan.nextInt();
        System.out.println("Enter your turkish grade:");
        int turkish = scan.nextInt();
        System.out.println("Enter your chemistry grade:");
        int chemistry = scan.nextInt();
        System.out.println("Enter your music grade:");
        int music = scan.nextInt();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        if (math > 0 && math < 100) {
            numbers.add(math);
        }
        if (physics > 0 && physics < 100) {
            numbers.add(physics);
        }
        if (turkish > 0 && turkish < 100) {
            numbers.add(turkish);
        }
        if (chemistry > 0 && chemistry < 100) {
            numbers.add(chemistry);
        }
        if (music > 0 && music < 100) {
            numbers.add(music);
        }

        int sum = 0;
        for (int num : numbers) {
            sum = sum + num;
        }
        System.out.println("Sum:" + sum);
        double average = 0;
        if (numbers.size() != 0) {
            average = sum / numbers.size();
            System.out.println("Average:"+average);
            if (average >= 55) {
                System.out.println("You passed!");
            } else {
                System.out.println("Unsuccessful...");
            }
        }
    }
}