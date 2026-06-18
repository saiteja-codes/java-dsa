public class linear{
    public static void main(String[] args) {
        
      int[] nums = {1,2,3,4};
      int target = 9;

		//Your code goes here
        boolean found = true;
        for(int i=0;i<nums.length;i++){
            if(target != nums[i]){
                found = false;
                
            }
            else{
               found = true;
            }

        }
        if(found == true){
            System.out.println("found");;
        }
        else{
            System.out.println("not found");
        }
        
    }
}
