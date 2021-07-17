import java.util.Scanner;

public class Main {
    public static void giris(){
        System.out.println("1-Toplama İşlemi\n2-Çıkarma İşlemi\n3-Çarpma İşlemi\n4-Bölme İşlemi\n" +
                "0-Çıkış");
    }
    static int toplama(int a,int b){
        int result=a+b;
        System.out.println("toplama:"+result);
        return result;
    }
    static int çıkarma(int a,int b){
        int result=a-b;
        System.out.println("çıkarma:"+result);
        return result;
    }
    static int çarpma(int a,int b){
        int result=a*b;
        System.out.println(result);
        return result;
    }
    static int bölme(int a,int b){
        if(b==0){
            System.out.println("Payda 0 olamaz.");
        }
        int result=a/b;
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int select;
       while (true){
           giris();
           System.out.println("İşlem:");
           select = scan.nextInt();
           if(select==0){
               System.out.println("bb");
               break;
           }
           System.out.println("a:");
           int a = scan.nextInt();
           System.out.println("b:");
           int b = scan.nextInt();
           switch(select){
               case 1:
                   toplama(a,b);
                   break;
               case 2:
                   çıkarma(a,b);
                   break;
               case 3:
                   çarpma(a,b);
                   break;
               case 4:
                   bölme(a,b);
                   break;
               default:
                   System.out.println("geçersiz.");
           }
           System.out.println("-------------------------------");
       }
    }

}
