import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class jan4 {
    public static void main(String[] args) {
       String []arr={"eat","tea","tan","ate","nat","bat"};
       System.out.println(groupAnagrams(arr)); 
    }
     public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> m=new HashMap<>();
         List<List<String>> k=new ArrayList<>();
        for(String t:strs)
        {
            char []arr=t.toCharArray();
            Arrays.sort(arr);
            String y=new String(arr);
            if(!m.containsKey(y))
            {
                m.put(y,new ArrayList<String>());//ate
            }
            m.get(y).add(t);
        }
        // System.out.println(m);
        k.addAll(m.values());
        return k;
    } 
}
