class Solution {

    public List<List<Integer>> subsets;
    public int[] nums;

    public List<List<Integer>> subsets(int[] nums) {

        subsets= new ArrayList<>();
        this.nums= nums;

        List<Integer> subset= new ArrayList<>();
        backtrack(0, subset);
        return new ArrayList<>(subsets);


       
    }

    void backtrack(int i, List<Integer> subset){
        if(i>=nums.length){
            subsets.add(new ArrayList<>(subset));
        }
        else{
            backtrack(i+1, subset);
            subset.add(nums[i]);
            backtrack(i+1, subset);
            subset.remove(subset.size()-1);
        }
    }
}
