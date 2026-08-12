// Last updated: 8/12/2026, 8:51:19 AM
class Solution {
    public int[][] transpose(int[][] matrix) {
        int i,j;
        int n= matrix.length;
        int m= matrix[0].length;
        int[][] arr = new int[m][n];
        for(i=0;i<m;i++){
             for(j=0;j<n;j++){
                arr[i][j]= matrix[j][i];

        }
    }
    return arr;
}
}