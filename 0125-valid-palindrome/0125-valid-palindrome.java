class Solution {
    public boolean isPalindrome(String s) {
        String cleaned = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int left =0;
        int right =cleaned.length()-1;
        while(left<right){
            if(cleaned.charAt(left) !=cleaned.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}