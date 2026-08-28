class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count=0;
        for(int i=low;i<=high;i++)
        {
            String s=String.valueOf(i);
            if(s.length()%2!=0)
            {
                continue;
            }
            int mid=s.length()/2;
            int s1=0;
            int s2=0;
            for(int j=0;j<mid;j++)
            {
               s1+=s.charAt(j)-'0';
            }
              for(int k=mid;k<s.length();k++)
            {
               s2+=s.charAt(k)-'0';
            }
            if(s1==s2)
            {
                count++;
            }
        }
        return count;
        
    }
}