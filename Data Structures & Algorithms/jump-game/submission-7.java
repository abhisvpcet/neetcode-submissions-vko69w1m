class Solution {
    public boolean canJump(int[] nums) {

        int n= nums.length;
        boolean[] dp= new boolean[n];
        dp[n-1]=true;

        for(int i=n-2; i>=0; i--){
          for(int j=1; j<=nums[i] && dp[i]==false && i+1<n; j++){
            dp[i]= dp[i+j];
          }
        }
        return dp[0];

    }
}
