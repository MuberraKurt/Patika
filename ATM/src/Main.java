import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName, password;
        int right = 0;
        int select;
        int price = scanner.nextInt();
        int balance=1500;
        while (right < 3) {
            System.out.println("Kullanıcı adı giriniz:");
            userName = scanner.nextLine();
            System.out.println("şifre giriniz:");
            password = scanner.nextLine();
            if (userName.equals("abc") && password.equals("123")) {
                System.out.println("Hoşgeldiniz...");
                System.out.println("1-Para yatırma\n" +
                        "2-Para çekme\n" +
                        "3-Bakiye Sorgula\n" +
                        "4-Çıkış Yapma");
                System.out.println("İşlem:");
                select = scanner.nextInt();
                switch (select) {
                    case 1:
                        System.out.println("Para miktarı:");
                        balance += price;
                        break;
                    case 2:
                        System.out.println("Para miktarı:");
                        if (price > balance) {
                            System.out.println("Bakiye Yetersiz.");
                        } else {
                            balance -= price;
                        }
                        break;
                    case 3:
                        System.out.println("Bakiyeniz:" + balance);
                        break;
                    case 4:
                        System.out.println("Tekrar görüşmek üzere...");
                        break;
                    default:
                        System.out.println("hatalı seçim...");
                        break;
                }
            }else{
                right--;
                System.out.println("hatalı kullanıcı adı veya şifre.Tekrar deneyiniz.");
                if(right==0){
                    System.out.println("Bloke");
                }else{
                    System.out.println("Kalan hakkınız:"+right);
                }
            }

        }
    }
}
