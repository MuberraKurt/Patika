import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random rand=new Random();
        int number=rand.nextInt(100);
        System.out.println(number);
        Scanner scan=new Scanner(System.in);
        int right=5,num,mistake=0,index=0;
        int[] wrong=new int[5];
        boolean isWin=false;
        while(right>0){
            System.out.println("0-100 arasında bir sayı giriniz:");
            num=scan.nextInt();
            if(num<0 || num>100){
                if(mistake==0) {
                    System.out.println("Hatalı giriş yaptınız.Sonraki hatada hakkınız düşecektir.");
                    mistake++;
                }else{
                    right--;
                    System.out.println("Birden fazla hatalı giriş yaptınız.Kalan hakkınız:"+right);
                }continue;
            }
          if(number==num){
              System.out.println("Tebrikler bildiniz.");
              isWin=true;
              break;
          }else{
              wrong[index++]=num;
              right--;
              if(num<number){
                  System.out.println("Tahmininiz gizli sayıdan küçüktür.");
              }else{
                  System.out.println("Tahmininz gizli sayıdan büyüktür.");
              }
              System.out.println("Kalan hakkınız:"+right);
          }

        }if(!isWin){
            System.out.println("Kaybettiniz!");
            System.out.println("Tahminleriniz:"+ Arrays.toString(wrong));

        }

    }
}
