class Solution {
    public int largestAltitude(int[] gain) {
        int alti = 0;
        int maxalt =0;
        for(int g : gain){
            alti += g;
            maxalt = Math.max(maxalt,alti);
        }
        return maxalt;
    }
}