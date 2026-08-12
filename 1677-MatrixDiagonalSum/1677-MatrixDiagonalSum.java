// Last updated: 8/12/2026, 8:50:35 AM
class Solution {
    public int diagonalSum(int[][] mat) {
        int p=0,s=0,i,j,res;
        for(i=0;i<mat.length;i++){
            for(j=0;j<mat.length;j++){
               
                     if(i==j)
                     p=p+mat[i][j];
                     if((i+j)==mat.length-1){
                     s+=mat[i][j];
                     if(i==j)
                     s=s-mat[i][j];
                     }
        }
        }
         res=p+s;
        return res;
        
    }
}