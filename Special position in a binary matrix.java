//LEETCODE PROBLEM
class Solution {
    public int numSpecial(int[][] mat) {
        int rows= mat.length;
        int cols= mat[0].length;
        int rowSum[] = new int[rows];
        int colSum[] = new int[cols];
        for(int row=0;row<rows;row++){
            for(int col=0;col<cols;col++){
                 rowSum[row]+=mat[row][col];
            }
        }
         for(int col=0;col<cols;col++){
            for(int row=0;row<rows;row++){
                 colSum[col]+=mat[row][col];
            }
        }

        int sum = 0;
        for(int row=0; row<rows;row++){
            for(int col=0;col<cols;col++){
                if(row==col && rowSum[row]==1 && colSum[col]==1 ){
                    sum++;

                }
            }
        }
        return sum;
    }
}
