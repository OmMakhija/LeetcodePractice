class Solution {
    public boolean isAnagram(String s, String t) {
        boolean ans = true;
        if(s.length()!=t.length()){
            ans=false;
        }
        else{
            int[] arr = new int[26];
            for(int i=0;i<s.length();i++){
                arr[s.charAt(i)-'a']++;
                arr[t.charAt(i)-'a']--;
            }
            for(int i=0;i<arr.length;i++){
                if(arr[i]!=0){
                    ans=false;
                }
            }

        }
        return ans;
    }
}