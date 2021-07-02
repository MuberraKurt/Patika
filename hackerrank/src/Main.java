import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz:");
        int n1=scan.nextInt();
        System.out.println("İkinci sayıyı giriniz:");
        int n2=scan.nextInt();
        System.out.println("1-Toplama\n 2-Çıkarma\n 3-Çarpma\n 4-Bölme");
        System.out.println("Yapacağınız işlem:");
        int select= scan.nextInt();
        switch(select){
            case 1:
                System.out.println("Toplam:"+(n1+n2));
                break;
            case 2:
                System.out.println("Çıkarma:"+(n1-n2));
                break;
            case 3:
                System.out.println("Çarpma:"+(n1*n2));
                break;
            case 4:
                if(n2!=0){
                System.out.println("Bölme:"+(n1/n2));}
                else{
                    System.out.println("Sayı 0'a bölünemez.Başka dğer giriniz...");
                }
                break;
            default:
                System.out.println("Yanlış seçim.Try again...");

        }
    }
}
