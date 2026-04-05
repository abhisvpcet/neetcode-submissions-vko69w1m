class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> answer= new ArrayList<>();
        int i=0, n= nums.length;
        Arrays.sort(nums);
        while(i<n){
            if(i>0 && nums[i]==nums[i-1]){
                i++;
                continue;
            }
            int target= -nums[i];
            List<List<Integer>> pairs= twoSum(nums, i+1, target);
            for(List<Integer> pair: pairs){
                List<Integer> triplet= new ArrayList<>();
                triplet.add(nums[i]);
                triplet.add(pair.get(0));
                triplet.add(pair.get(1));
                answer.add(triplet);
            }
            i++;
        }
        return answer;
    }

    private List<List<Integer>> twoSum(int[] nums, int start, int target){
        int f= start;
        int s= nums.length-1;
        int end= nums.length-1;

        List<List<Integer>> pairs= new ArrayList<>();

        while(f<s){
            if(f-1>=start && nums[f]==nums[f-1]){
                f++;
                continue;
            }
            if(s+1<=end && nums[s]== nums[s+1]){
                s--;
                continue;
            }

            if(nums[f]+nums[s]<target){
                f++;
            }
            else if(nums[f]+nums[s]>target){
                s--;
            }
            else{
                List<Integer> pair= new ArrayList<>();
                pair.add(nums[f]);
                pair.add(nums[s]);
                pairs.add(pair);
                f++;
            }
        }
        return pairs;
    }
}
