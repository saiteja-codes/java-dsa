
import java.util.Scanner;

public class sorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements of array");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
            
        }
        boolean sorted = true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] > arr[i+1]){
                sorted = false;
             }
            

        }
        if(sorted == true){
            System.out.println("array is sorted");
        }
        else {
            System.out.println("not sorted");
        }



        
        
        
    }
    
}
