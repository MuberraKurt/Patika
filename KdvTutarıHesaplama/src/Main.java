import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	double tutar;
	Scanner scan=new Scanner(System.in);
        System.out.println("tutar giriniz:");
	tutar=scan.nextDouble();
	if( 0<tutar && tutar<1000){
     double kdvOranı=0.18;
     double kdvTutarı=tutar*kdvOranı;
     double kdvliFiyat=tutar+kdvTutarı;
        System.out.println("KDV'li Fiyat:"+kdvliFiyat);
    }
	else if (1000<tutar){
        double kdvOranı=0.08;
        double kdvTutarı=tutar*kdvOranı;
        double kdvliFiyat=tutar+kdvTutarı;
        System.out.println("KDV'li Fiyat:"+kdvliFiyat);
    }
    }
}
