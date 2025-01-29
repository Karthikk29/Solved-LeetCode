class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ind1=0;
        int ind2=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    ind1=i;
                    ind2=j;
                }
            }
        }
        return new int[]{ind1,ind2};
    }
}