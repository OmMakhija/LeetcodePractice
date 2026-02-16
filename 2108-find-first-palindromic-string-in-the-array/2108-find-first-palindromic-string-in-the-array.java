class Solution {
    public String firstPalindrome(String[] words) {
        String ans="";
        for(int i=0;i<words.length;i++){
            String word = words[i];
            String reversed = new StringBuilder(word).reverse().toString();   
            if(word.equals(reversed)){
                ans = word;
                break;
            }
        }
        return ans;
    }
}