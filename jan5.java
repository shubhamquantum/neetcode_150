import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class jan5{
    public static void main(String[] args) {
        int []nums = {1,1,1,2,2,3,3,3,3};
        int  k = 2;
       int arr[]=topKFrequent(nums, k);
       for(int i=0;i<arr.length;i++)
       {
        System.out.println(arr[i]);
       }
        
    }
    
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> m=new HashMap<>();
        int arr[]=new int[k];
        for(int i=0;i<nums.length;i++)
        {
            if(!m.containsKey(nums[i]))
            {
                m.put(nums[i], 1);
            }
            else{
                m.put(nums[i],m.get(nums[i])+1);
            }
        }
        Map<Integer,Integer> topK=m.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).limit(k).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
        int i=0;
        for(int ele:topK.keySet()){
            arr[i++]=ele;
        }

       /*  List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(m.entrySet());

        // Using Comparator to sort based on values
        entryList.sort(Map.Entry.comparingByValue());
         Map<Integer, Integer> reversedSortedMap = new LinkedHashMap<>();
        // Creating a new LinkedHashMap to maintain the order of elements
        Map<Integer, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<Integer, Integer> entry : entryList) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        Map<Integer, Integer> topKElements = new LinkedHashMap<>();
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : reversedSortedMap.entrySet()) {
            topKElements.put(entry.getKey(), entry.getValue());
            count++;
            if (count == k) {
                break;
            }
        }
        System.out.println(topKElements);
        System.out.println(sortedMap); */
        return arr;

    }
}