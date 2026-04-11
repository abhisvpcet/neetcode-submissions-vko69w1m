class Solution {
    public int[] twoSum(int[] numbers, int target) {

       int f=0;
       int s=numbers.length-1;
       int[] ans= new int[2];

       while(f<s){
        int sum= numbers[s]+ numbers[f];

        if(sum>target){
          s--;
        }
        else if(sum<target){
          f++;
        }
        else{
          ans[0]=f+1;
          ans[1]= s+1;
          break;
        }
       }
       return ans;
    }
}
