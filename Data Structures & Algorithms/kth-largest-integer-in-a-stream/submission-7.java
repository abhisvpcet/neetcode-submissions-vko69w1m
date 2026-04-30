class KthLargest {

   private PriorityQueue<Integer> minHeap;
   private int k;

    public KthLargest(int k, int[] nums) {

       minHeap= new PriorityQueue<>();
       this.k=k;

       for(int num: nums){
        add(num);
       }
    }
       private int add(int val){
        if(minHeap.size()<this.k){
            minHeap.offer(val);
        }
        else{
            if(val>=minHeap.peek()){
                minHeap.offer(val);
                minHeap.poll();
            }
        }
        return minHeap.peek();
       }
}
