public class Main {
    public static boolean isPalindrom(int number){
        int temp=number,reverse=0,lastNumber;
        while(temp!=0){
         lastNumber=temp%10;
         reverse=(reverse*10)+lastNumber;
         temp=temp/10;
        }
        if(number==reverse)
        return true;
        else
            return false;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrom(3663));
    }
}
