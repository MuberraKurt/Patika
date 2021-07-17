import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
        System.out.println("Taban değeri giriniz:");
        int taban=scan.nextInt();
        System.out.println("Üs değeri:");
        int us= scan.nextInt();
        System.out.println(Uslu(taban,us));
    }
    static int Uslu(int taban,int us){
        if(us>1) {
            taban=taban*Uslu(taban,us-1);
        }
        return taban;
    }
}
