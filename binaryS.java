import java.util.Scanner;

public class binary {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        System.out.println("enter the elements of array");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the target");
        int target = sc.nextInt();
        int low = 0;
        int high = arr.length-1;
        while(low <= high){
            int mid = low + ((high - low)/2);
            if(target == arr[mid]){
                System.out.println("found"+mid);
                return;
            }
            else if(target > arr[mid]){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }

    
}
}
}
