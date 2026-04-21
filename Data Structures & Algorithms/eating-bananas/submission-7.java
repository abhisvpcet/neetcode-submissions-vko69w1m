class Solution {
    public int minEatingSpeed(int[] piles, int h) {

      int start=1;
      int end= maxEle(piles);
      int ans= end;

      while(start<=end){
        int speed= (start+end)/2;

        int noOfHours= calculateNoOfHours(piles, speed);

        if(noOfHours>h){
            start= speed+1;

        }
        else{
            ans= speed;
            end= speed-1;
        }

      }
      return ans;
    }

    int maxEle(int[] piles){
        int maxEle= piles[0];
        for(int num: piles){
            if(num>maxEle){
                maxEle=num;
            }
        }
        return maxEle;
    }

    int calculateNoOfHours(int[] piles, int speed){
        int noOfHours=0;
        for(int pile: piles){
            noOfHours +=Math.ceil((pile+0.0)/speed);

        }
        return noOfHours;
    }
}
