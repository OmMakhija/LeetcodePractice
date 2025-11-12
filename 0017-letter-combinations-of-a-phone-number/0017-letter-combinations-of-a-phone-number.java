class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.length() != 0){
        ArrayList<String>ans=new ArrayList<>();
        String output="";
        String[] mapping={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        solve(digits,output,0,ans,mapping);
        return ans;
        }
        else{
            return Collections.emptyList();
        }
    }
    public static void solve(String digits,String output, int idx, List<String>ans,String[] mapping){
        if(idx==digits.length()){
            ans.add(output);
            return;
        }
        int num=digits.charAt(idx)-'0';
        String value=mapping[num];

        for(int i=0;i<value.length();i++){
            solve(digits,output+value.charAt(i),idx+1,ans,mapping);
        }
    }
}