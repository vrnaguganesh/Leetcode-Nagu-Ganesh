// Last updated: 8/12/2026, 9:32:17 PM
class Solution {
    public int addDigits(int num) {
        int temp=num;
        int d,sum;
        while(num>9)
        {
            sum=0;
        
        while(num!=0){
        d=num%10;
        sum=sum+d;
        num=num/10;
        }
        num=sum;
        }
        return num;
       
    }
}