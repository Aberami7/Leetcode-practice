class Solution {
    public int findLUSlength(String a, String b) {
        if(a.equals(b))
        {
            return -1;
        }
        return (int)Math.max(a.length(),b.length());
        
    }
}