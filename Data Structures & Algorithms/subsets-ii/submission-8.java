class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {

       Set<List<Integer>> subsets= new HashSet<>();
       Arrays.sort(nums);
       backtrack(subsets, new ArrayList<>(), nums, 0);
       return new ArrayList<>(subsets);
    }

    void backtrack(Set<List<Integer>> subsets, List<Integer> currentSubsets, int[] nums, int i){
        if(i==nums.length){
            subsets.add(new ArrayList<>(currentSubsets));
        }
        else{
            currentSubsets.add(nums[i]);
            backtrack(subsets, currentSubsets, nums, i+1);
            currentSubsets.remove(currentSubsets.size()-1);
            backtrack(subsets, currentSubsets, nums, i+1);
        }
    }
}
