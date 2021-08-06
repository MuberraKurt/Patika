import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int n,n1=0,n2=1,n3 ;
        System.out.println("Eleman sayısı:");
        n= scan.nextInt();
        System.out.print(n1+"\t"+n2);
        for(int i=2;i<n;i++){
            n3=n1+n2;
            System.out.print("\t"+n3);
            n1=n2;
            n2=n3;
    }
    }
}
