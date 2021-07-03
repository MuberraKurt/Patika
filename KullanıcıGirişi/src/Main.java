import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kullanıcı adı giriniz:");
        String name1 = scan.nextLine();
        System.out.println("Şifre giriniz:");
        String password1 = scan.nextLine();
        String name="Kelebek";
        String password="abs";
        if(name.equals(name1) && password.equals(password1) ){
            System.out.println("Başarılı girş.");
        }else if(name1.equals(name) && !(password1.equals(password))){
            System.out.println("Yeni şifreyi giriniz:");
            String newPassword=scan.nextLine();
            if(!(newPassword.equals(password)) && !(newPassword.equals(password1))){
                System.out.println("Şifre oluşturuldu");
            }else{
                System.out.println("Şifre oluşturma başarısız");
            }
        }



    }
}

