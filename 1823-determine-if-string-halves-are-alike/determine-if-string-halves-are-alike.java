class Solution {
    public boolean halvesAreAlike(String s) {
        String a=s.substring(0,s.length()/2);
        String b=s.substring(s.length()/2,s.length());
        int a1=0;
        int b1=0;
        for(int i=0;i<a.length();i++)
        {
            if("aeiouAEIOU".indexOf(a.charAt(i))!=-1)
            {
                a1++;
            }
        }
         for(int i=0;i<a.length();i++)
        {
            if("aeiouAEIOU".indexOf(b.charAt(i))!=-1)
            {
                b1++;
            }
        }
        return a1==b1;
        
    }
}