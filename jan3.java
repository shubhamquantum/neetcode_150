import java.util.Arrays;

public class jan3 {
    public static void main(String[] args) {
        int []nums = {2,7,11,15};
        int  target = 3;
        System.out.println(twoSum(nums, target));
        /* int arr[]=twoSum(nums, target) ;
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        } */
    }
    
    public static boolean twoSum(int[] nums, int target) {
        // int arr[]=new int[2];
        Arrays.sort(nums);
        int i=0;
        int n=nums.length;
        int j=n-1;
        while(i<j)
        {
            if(nums[i]+nums[j]==target)
            {
                /* arr[0]=i;
                arr[1]=j; */
                return true;
            }
            else if(nums[i]+nums[j]>target){
                j--;
            }
            else
            {
                i++;
            }
        }
        return false;
    }
}
