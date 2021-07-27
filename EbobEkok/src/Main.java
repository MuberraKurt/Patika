import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int mod,mod2,ebob=1,ekok=1;
	Scanner scan=new Scanner(System.in);
        System.out.println("Sayı1:");
        int num=scan.nextInt();
        System.out.println("Sayı2:");
        int num2= scan.nextInt();
    for(int i=1; i<=num;i++)  {
       if(num%i==0 && num2 %i==0){
           ebob=i;
       }

    }
    for(int i=num;i>1;i--){
        if(num%i==0 && num2 %i==0){
            ekok=i;
        }
    }
        System.out.println(ebob);
        System.out.println(ekok);
    }
}
