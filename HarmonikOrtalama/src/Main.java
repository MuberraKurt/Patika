import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    int n;
    double sum=0,average;
	int[] list={1,2,3,4,5};
	for(int i=0;i< list.length;i++){
	    sum+=1.0/list[i];
    }
	average= list.length/sum;
        System.out.println(average);
    }
}
