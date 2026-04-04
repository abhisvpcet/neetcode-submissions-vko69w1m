class Solution {
    public List<List<Integer>> permute(int[] nums) {

     List<List<Integer>> ans= new ArrayList<>();
     backtrack(ans, new ArrayList<>(), new HashMap<Integer, Boolean>(), 0, nums);
     return ans;
    }

    void backtrack(List<List<Integer>> ans, List<Integer> current, HashMap<Integer, Boolean> used, int i, int[] nums){
        if(i==nums.length){
            ans.add(new ArrayList<>(current));
            return;
        }
        else{
            for(int num: nums){
                if(!used.containsKey(num) || used.get(num)==false){
                    current.add(num);
                    used.put(num, true);
                    backtrack(ans, current, used, i+1, nums);
                    current.remove(current.size()-1);
                    used.put(num, false);
                }
            }
        }

    }
}
