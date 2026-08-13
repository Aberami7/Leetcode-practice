class Solution {
    public boolean checkZeroOnes(String s) {
        int max=0;
        int count=0;
        int max1=0;
        int count1=0;

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1')
            {
                count++;
            }
            else
            {
                count=0;
            }
            max=Math.max(max,count);
        }
         for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='0')
            {
                count1++;
            }
            else
            {
                count1=0;
            }
            max1=Math.max(max1,count1);
        }
        if(max>max1)
        {
            return true;
        }
        return false;
        
    }
}