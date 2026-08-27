class Solution {
    public int maxScore(String s) {
        int max=0;
        for(int i=0;i<s.length()-1;i++)
        {
            int c1=0;
            int c2=0;
            String a=s.substring(0,i+1);
            String b=s.substring(i+1);
            for(int j=0;j<a.length();j++)
            {
                if(a.charAt(j)=='0')
                {
                  c1++;
                }
            }
            for(int k=0;k<b.length();k++)
            {
                if(b.charAt(k)=='1')
                {
                    c2++;
                }
            }
            max=Math.max(max,c1+c2);
        }
        return max;
        
    }
}