class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        int direction=0;
        int m= matrix.length;
        int n= matrix[0].length;

        List<Integer> answer= new ArrayList<>();
        int top=0, bottom= m-1, left=0, right= n-1;

        while(top<=bottom && left<=right){
            if(direction==0){
                //left to right
                for(int j=left; j<=right; j++){
                    answer.add(matrix[top][j]);
                }
                direction=1;
                top++;
            }
            else if(direction==1){
                // top to down
                for(int i=top; i<=bottom; i++){
                    answer.add(matrix[i][right]);
                }
                direction=2;
                right--;
            }
            else if(direction==2){
                // right to left
                for(int j=right; j>=left; j--){
                    answer.add(matrix[bottom][j]);
                }
                direction=3;
                bottom--;
            }
            else{
                for(int i=bottom; i>=top; i--){
                    answer.add(matrix[i][left]);
                }
                left++;
                direction=0;
            }
        }
        return answer;
        
    }
}
