import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
        System.out.println("Distance(kilometer):");
        double km=scan.nextDouble();
        System.out.println("Age:");
        int age=scan.nextInt();
        System.out.println("Trip type(1=>:one direction/n 2=>round trip");
        int tripType=scan.nextInt();
        double fee=km*0.10;
        if(0<km && 0<age && (tripType==1 || tripType==2)){
            System.out.println("Total fee:"+fee);
            if(age<12){
                double ageDiscount=fee*0.50;
                System.out.println("Age discount:"+ageDiscount);
                double discountFee=fee-ageDiscount;
                System.out.println("Discount fee"+ discountFee);
                if(tripType==2){
                    double tripDiscount=discountFee*0.20;
                    System.out.println("Round trip discount:"+tripDiscount);
                    fee=(fee-tripDiscount)*2;
                }else if(tripType==1){
                    fee=discountFee;
                }
            }else if(12<=age && age<=24 ){
                double ageDiscount=fee*0.10;
                System.out.println("Age discount:"+ageDiscount);
                double discountFee=fee-ageDiscount;
                System.out.println("Discount fee"+ discountFee);
                if(tripType==2){
                    double tripDiscount=discountFee*0.20;
                    System.out.println("Round trip discount:"+tripDiscount);
                    fee=(fee-tripDiscount)*2;
                }else if(tripType==1){
                    fee=discountFee;
                }
            }else if(65<age){
                double ageDiscount=fee*0.30;
                System.out.println("Age discount:"+ageDiscount);
                double discountFee=fee-ageDiscount;
                System.out.println("Discount fee"+ discountFee);
                if(tripType==2){
                    double tripDiscount=fee*0.20;
                    System.out.println("Round trip discount:"+tripDiscount);
                    fee=(fee-tripDiscount)*2;
                }else if(tripType==1){
                    fee=discountFee;
                }
            }
            System.out.println("Total fee:"+fee);
        }else{
            System.out.println("You Entered Incorrect Data!");
        }


    }
}
