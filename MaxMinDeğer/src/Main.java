import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, indis;
        int[] arr = {1, 5, 9, 8, 20, 23, 25, 100, 7};
        Arrays.sort(arr);
        System.out.println("Sayı giriniz:");
        num = scan.nextInt();
        int[] newList=Arrays.copyOf(arr,10);
        newList[9]=num;
        Arrays.sort(newList);
        indis=Arrays.binarySearch(newList,num);
        System.out.println("Girilen sayıdan küçük en yakın sayı:"+newList[indis-1]);
        System.out.println("Girilen sayıdan büyük en yakın sayı:"+newList[indis+1]);
    }
}
