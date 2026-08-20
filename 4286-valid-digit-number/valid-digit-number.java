class Solution {
    public boolean validDigit(int n, int x) {
        String s=String.valueOf(n);
        String z=String.valueOf(x);
        if(s.charAt(0)!=z.charAt(0) && s.contains(z))
        {
            return true;
        }
        return false;
        
    }
}