import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("m:");
        int m = scan.nextInt();
        System.out.println("u:");
        int u = scan.nextInt();
        System.out.println("b:");
        int b = scan.nextInt();
        if (m < u && m < b) {
            if (u < b) {
                System.out.println("m<u<b");
            }else{
                System.out.println("m<b<u");
            }

        }else if(b<u && b<m){
            if(m<u){
                System.out.println("b<m<u");
            }else{
                System.out.println("b<u<m");
            }
        }else if(u<b&&u<m){
            if (b<m){
                System.out.println("u<b<m");
            }else{
                System.out.println("u<m<b");
            }
        }
    }
}
