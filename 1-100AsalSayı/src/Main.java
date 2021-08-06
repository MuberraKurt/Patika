public class Main {

    public static void main(String[] args) {
        int num=2,control;
	while(num<=100){
	    control=0;
	    for(int i=2;i<num;i++){
	        if(num%i==0){
	            control=1;
                break;
            }
        }if(control==0){
            System.out.print(num+" ");

        }
	    num++;
    }
    }
}
