import java.util.HashMap;
import java.util.Map;

public class jan3_2 {
    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 26;
        // System.out.println(twoSum(nums, target));

        int arr[] = twoSum(nums, target);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> m = new HashMap<>();
        int arr[] = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int k = target - nums[i];
            if (m.containsKey(k)) {
                arr[0] = m.get(k);
                arr[1] = i;
                return arr;
            }
            m.put(nums[i], i);
        }
        return arr;

    }
}
