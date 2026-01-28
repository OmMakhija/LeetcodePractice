import java.util.*;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramMap = new HashMap<>();
        
        for (String s : strs) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);
            anagramMap.computeIfAbsent(sortedStr, k -> new ArrayList<>()).add(s);
        }
        
        return new ArrayList<>(anagramMap.values());
    }
}