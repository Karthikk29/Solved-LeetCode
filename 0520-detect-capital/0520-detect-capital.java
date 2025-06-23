class Solution {
    public boolean detectCapitalUse(String word) {
        int capitalCount = 0;

        for (char c : word.toCharArray()) {
            if (Character.isUpperCase(c)) {
                capitalCount++;
            }
        }

        return capitalCount == word.length() || 
               capitalCount == 0 || 
               (capitalCount == 1 && Character.isUpperCase(word.charAt(0)));
    }
}
