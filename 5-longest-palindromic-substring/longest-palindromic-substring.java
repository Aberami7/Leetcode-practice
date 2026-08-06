class Solution {
    public String longestPalindrome(String s) {
        String ans="";
        for(int i=0;i<s.length();i++){
        for(int j=i;j<s.length();j++)
        {
             int l=i;
             int r=j;
             while(l<=r&& s.charAt(l)==s.charAt(r))
             {
                l++;
                r--;
             }
             if(l>r)
             
             {
                if((j-i+1)>ans.length())
                {
                    ans=s.substring(i,j+1);
                }

             }
        }

        
    }
    return ans;
    }
}