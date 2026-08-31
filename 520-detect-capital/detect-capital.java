class Solution {
    public boolean detectCapitalUse(String word) {
        String x="";
        x+=word.charAt(0);
        
       
        if (word.equals(word.toUpperCase()) ||
            word.equals(word.toLowerCase()) ||
            (Character.isUpperCase(word.charAt(0)) &&
             word.substring(1).equals(word.substring(1).toLowerCase()))) {
        
            return true;
        }
        return false;
        
    }
}