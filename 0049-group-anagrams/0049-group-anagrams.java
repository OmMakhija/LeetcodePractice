import java.util.*;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0) return new ArrayList<>();
        Map<String,List<String>> map = new HashMap<>();
        for(String s : strs){
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String SortedS = new String(charArray);

            map.putIfAbsent(SortedS, new ArrayList<>());
            map.get(SortedS).add(s);
        }
        return new ArrayList<>(map.values());
    }
}