class Solution {
    public String intToRoman(int num) {
        int[] value = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String[] symbol = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};

        int n = symbol.length;
        String result = "";
        for(int i=n-1;i>=0;i--){
            if(Math.abs(num/value[i])>0){
                int count = num/value[i];
                for(int j=0;j<count;j++){
                result = result + symbol[i];
                }
                num = num % value[i];
            }
        }
        return result;
    }
}