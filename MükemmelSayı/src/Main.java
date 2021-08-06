import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int num,sum=0;
        System.out.println("Bir sayı giriniz:");
        num=scan.nextInt();
        for(int i=1;i<num;i++){
          if(num%i==0)  {
              sum +=i;
          }
        }if(sum==num){
            System.out.println(num+" Mükemmel sayıdır");
        }else{
            System.out.println(num+" Mükemmel sayı değildir.");
        }
    }
}
