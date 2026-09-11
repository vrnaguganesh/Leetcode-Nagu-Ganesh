// Last updated: 9/11/2026, 10:11:31 AM
1class Solution {
2    public List<Integer> spiralOrder(int[][] matrix) {
3        List<Integer> l=new ArrayList<>();
4        int row=matrix.length;
5        int col =matrix[0].length;
6        int t=0;
7        int b=row-1;
8        int le=0;
9        int r=col-1;
10        while(t<=b && le<=r){
11        for(int i=t;i<=r;i++){
12            l.add(matrix[t][i]);
13        }
14        t++;
15        for(int i=t;i<=b;i++){
16            l.add(matrix[i][r]);
17        }
18        r--;
19        if(b>=t){
20            for(int i=r;i>=le;i--){
21                l.add(matrix[b][i]);
22            }
23            b--;
24
25        }
26        if(le<=r){
27            for(int i=b;i>=t;i--){
28                l.add(matrix[i][le]);
29            }
30            le++;
31        }
32        }
33        return l;
34
35    }
36}