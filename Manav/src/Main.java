import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlıcan=5.00;
	Scanner scan=new Scanner(System.in);
        System.out.println("Armut kaç kilo?:");
        int armutkg=scan.nextInt();
        System.out.println("Elma kaç kilo?:");
        int elmakg=scan.nextInt();
        System.out.println("Domates kaç kilo?:");
        int domatestkg=scan.nextInt();
        System.out.println("Muz kaç kilo?:");
        int muzkg=scan.nextInt();
        System.out.println("Patlıcan kaç kilo?:");
        int patlıcankg=scan.nextInt();
     double toplam=(armut*armutkg)+(elma*elmakg)+(domates*domatestkg)+(muz*muzkg)+(patlıcan*patlıcankg);
        System.out.println("Toplam tutar:"+toplam+ "TL");


    }
}
