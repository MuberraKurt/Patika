import java.util.Scanner;

public class Main {
    static int isAsal(int n,int sayac){
     if(sayac==1){
         return 1;
     }else{
         if(n%sayac==0)
             return 0;
         else
            return isAsal(n, sayac - 1);
     }

    }
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
        System.out.println("Sayı giriniz:" );
        int n= scanner.nextInt();
        int asal= isAsal(n,n/2);
        if(asal==1) {
            System.out.println("Asal   " +n);
        }else{
            System.out.println("Asal değil  "+n);
        }
    }
}
