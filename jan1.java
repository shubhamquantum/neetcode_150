import java.util.HashSet;
import java.util.Set;

class jan1 {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        System.out.println(containsDuplicate(arr));
    }
    
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> m=new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
         // No duplicates found
         if(m.contains(nums[i]))
         {
            return true;
         }
         m.add(nums[i]);
        }
        return false;
    }

}