public class Main {

    public static void main(String[] args) {
        int count = 1, visit=-1;
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
             if(arr[i]== arr[j]){
                 count++;
                 newArr[j]=visit;
             }
            }
            if(newArr[i]!=visit)
                newArr[i] =count;

        }
        for(int i=0;i< newArr.length;i++){
            if(newArr[i]!=visit){
                System.out.println(arr[i]+"sayısı"+newArr[i]+"kere tekrar edildi");
            }
        }
    }
}


