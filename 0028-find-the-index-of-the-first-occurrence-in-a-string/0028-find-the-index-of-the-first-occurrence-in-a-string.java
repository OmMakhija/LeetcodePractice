class Solution {
    public int strStr(String haystack, String needle) {
        int l=0;
        int r=needle.length()-1;
        String curr = "";
        int ans=-1;
        while(r<haystack.length()){ 
            int curr_i=-1;
            for(int i=l;i<=r;i++){
                curr+=haystack.charAt(i);
            }
            if(curr.equals(needle)){
                ans=l;
                break;
            }
            else if(!curr.equals(needle)){
                l++;
                r++;
                curr="";
            }
            
            
        }
        return ans;
        
    }
}