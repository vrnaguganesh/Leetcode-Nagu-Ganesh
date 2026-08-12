// Last updated: 8/12/2026, 8:49:33 AM
class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==-1){
                    int m=matrix[0][j];
                    for(int k=0;k<matrix.length;k++){
                        if(matrix[k][j]>m)
                        m=matrix[k][j];
                    }
                    matrix[i][j]=m;
                }
            }
        }
        System.out.print( Arrays.deepToString(matrix));
        return matrix;
    }
}