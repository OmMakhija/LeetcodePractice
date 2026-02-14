class Solution {
    public boolean lemonadeChange(int[] bills) {
        int count=0;
        int count5=0;
        int count10=0;
        int count20=0;

        for(int i=0;i<bills.length;i++){
            if(bills[i]==5){
                count5++;
                count++;
            }
            else if(bills[i]==10 && count5>0){
                count10++;
                count5--;
                count++;
            }
            else if(bills[i]==20){
                if(count5>0 && count10>0){
                    count5--;
                    count10--;
                    count20++;
                    count++;
                }
                else if(count5>2){
                    count5=count5-3;
                    count20++;
                    count++;
                }
            }
        }
        if(count>=bills.length){
            return true;
        }
        else{
            return false;
        }
    }
}