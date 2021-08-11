import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int num,startindex=0;
        System.out.println("Kaç elemanlı dizi olsun:");
        num= scan.nextInt();
        int[] arr= new int[num];
        int[] duplicate=new int[num];
        for(int i=0;i< arr.length;i++){
            System.out.println("Sayı giriniz:");
            arr[i]= scan.nextInt();
        }
        for(int i=0;i< arr.length;i++){
            for(int j=0;j< arr.length;j++){
                if(i!=j && arr[i]==arr[j]){
                    duplicate[startindex]=arr[i];
                }
                break;
            }
        }
        System.out.println(Arrays.toString(duplicate));
    }
}
