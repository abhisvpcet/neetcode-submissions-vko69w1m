class Solution {
    public int longestConsecutive(int[] nums) {

    int ans=0;
    HashMap<Integer, Boolean> answer= new HashMap<>();

    for(int num: nums){
        answer.put(num, true);
    }

    for(int num: answer.keySet()){
        if(answer.containsKey(num-1)){
            continue;
        }
        int nextNum= num+1;
        int count=1;

        while(answer.containsKey(nextNum)){
            nextNum++;
            count++;


        }
        if(count>ans){
            ans= count;
        }
    }
    return ans;

    }
}

