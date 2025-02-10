class Solution {
    public int[] rearrangeArray(int[] nums) {
        int i=0;
        int j=1;
        int[] ans = new int[nums.length];
        for(int x : nums){
            if(x>0){
                ans[i]=x;
                i +=2;
            }
            else{
                ans[j]=x;
                j+=2;
            }
        }
        return ans;
    }
}