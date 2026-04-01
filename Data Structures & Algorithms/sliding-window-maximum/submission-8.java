class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

      Deque<Integer> de= new LinkedList<>();
      List<Integer> answer= new ArrayList<>();

      int n= nums.length;
      de.offer(0);

      for(int i=1; i<k; i++){
         while(de.size()>0 && nums[de.peekLast()]< nums[i]){
            de.removeLast();
         }
         de.offerLast(i);
      }
      answer.add(nums[de.peek()]);
      for(int j=k; j<n; j++){
         int startingPoint= j-k+1;
         while(de.size()>0 && de.peek()<startingPoint){
            de.removeFirst();
         }

         while(de.size()>0 && nums[de.peekLast()]<nums[j]){
            de.removeLast();
         }
         de.offerLast(j);
         answer.add(nums[de.peek()]);
      }

      int[] ansArray= new int[answer.size()];
      for(int i=0; i<answer.size(); i++){
         ansArray[i]= answer.get(i);
      }
      return ansArray;

        
    }
}
