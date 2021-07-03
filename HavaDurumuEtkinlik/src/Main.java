import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int havaDurumu=scan.nextInt();
	if (havaDurumu<=5){
        System.out.println("Kayak");
    }else if(5<havaDurumu && havaDurumu<15){
        System.out.println("Sinema");
    }else if(15<=havaDurumu && havaDurumu<25){
        System.out.println("Piknik");
    }else if(25<=havaDurumu ){
        System.out.println("Yüzme");
    }
    }
}
