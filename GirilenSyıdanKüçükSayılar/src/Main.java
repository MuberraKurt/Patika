import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    int n;
	Scanner scan=new Scanner(System.in);
        System.out.println("Sayı:");
        n= scan.nextInt();
	for(int i = 0; i<n; i++){
     if(i%4==0 && i%5==0){
         System.out.println(i);
     }
    }
    }
}
