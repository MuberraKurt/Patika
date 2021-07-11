import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int star=scan.nextInt();
        int half=(star/2)+1;
        for(int i=1;i<=half;i++){
            for(int j=1;j<= half-i ;j++){
                System.out.print(" ");
            }
            for(int k=1; k<=(2*i)-1; k++){
                System.out.print("*");
            }

            System.out.println();
        }
        for(int i=half-1;i>=1;i--){
            for(int j=1;j<=half-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
