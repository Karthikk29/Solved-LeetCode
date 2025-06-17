class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int winsum=0;
       for(int i=0;i<k;i++){
         winsum += nums[i];
       }
       int max = winsum;
       for(int end =k;end<nums.length;end++){
        winsum +=nums[end]-nums[end-k];
        max = Math.max(winsum,max);
       }
       return (double)max/k;
    }
}