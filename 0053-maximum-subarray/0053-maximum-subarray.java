class Solution {
    public int maxSubArray(int[] nums) {
        int curmax = nums[0];
        int maxsum = nums[0];
        for(int i=1;i<nums.length;i++){
            curmax = Math.max(curmax+nums[i],nums[i]);
            maxsum = Math.max(maxsum,curmax);
        }
        return maxsum;
    }
}