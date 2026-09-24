// Last updated: 9/24/2026, 9:51:38 AM
1class Solution {
2    public int mySqrt(int x) {
3    int low=0;
4    int high=x;
5    int ans=0;
6
7    while(low<=high){
8        int mid=low+(high-low)/2;
9
10        long sq=(long)mid*mid;
11
12        if(sq==x){
13            return mid;
14        }
15
16        
17        if(sq>x){
18           high=mid-1;
19        }
20        else{
21            ans=mid;
22            low=mid+1;
23
24        }
25    }   
26    return ans; 
27    }
28}