import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
	Scanner scan=new Scanner(System.in);
        System.out.println("kaç sayı gireceksiniz:");
        n= scan.nextInt();
        int gecici;
        int[] list=new int[n];
        for(int i=0;i<list.length ;i++){
            System.out.println(i+1 +"'inci sayıyı giriniz:");
            list[i]= scan.nextInt();
        }
        for(int i=0;i< list.length-1;i++){
            for(int j=i+1;j< list.length;j++){
                if(list[j]<list[i]){
                    gecici=list[i];
                    list[i]=list[j];
                    list[j]=gecici;
                }
            }
        }
        System.out.println("En küçük eleman:"+list[0]);
        System.out.println("En büyük:"+ list[list.length-1]);

    }
}
