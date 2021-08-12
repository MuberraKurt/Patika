import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int num;
        System.out.print("Dizinin boyutu :");
        num=scan.nextInt();
        int[] arr=new int[num];
        System.out.println("Dizinin elemanlarını giriniz:");
        for(int i=0;i< arr.length;i++){
            System.out.print((i+1)+ ". Elemanı:");
            arr[i]= scan.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

