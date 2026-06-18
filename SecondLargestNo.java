import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        System.out.println("give elements as input");
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();

        }
        

       
        int lar = arr[0];
        int sndlar = arr[1];
        if(lar < sndlar){
            lar = arr[1];
            sndlar = arr[0];

        }

        for(int i =2;i<arr.length;i++){
            if(arr[i] > lar){
                sndlar = lar;
                lar = arr[i];
            }
            else if(arr[i] > sndlar){
                sndlar = arr[i];
            }
        }
        System.out.println("the second largest element"+sndlar);
    
}
}
