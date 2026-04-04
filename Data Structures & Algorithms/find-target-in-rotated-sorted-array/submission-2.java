class Solution {
    public int search(int[] nums, int target) {

        int por= findPor(nums);
        if(target<nums[0] || por==0){
            return binarySearch(nums, por, nums.length-1, target);
        }
        else{
            return binarySearch(nums, 0, por-1, target);
        }
    }

        int binarySearch(int[] nums, int startingPoint, int endingPoint, int key){
            int start= startingPoint;
            int end= endingPoint;

            while(start<=end){
                int mid=(start+end)/2;
                if(nums[mid]<key){
                    start= mid+1;

                }
                else if(nums[mid]>key){
                    end= mid-1;
                }
                else{
                    return mid;
                }
            }
            return -1;
        }

        int findPor(int[] nums){
            int start=0;
            int end= nums.length-1;
            int ans=0;

            while(start<=end){
                int mid= (start+end)/2;
                if(nums[mid]>=nums[0]){
                    start= mid+1;
                }
                else{
                    ans= mid;
                    end= mid-1;
                }
            }
            return ans;
        }

}
