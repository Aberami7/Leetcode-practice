class Solution {
    public int smallestNumber(int n, int t) {
       int ans=0;
        for(int i=n;i<Integer.MAX_VALUE;i++)
        {
            int n2=i;
            int p=1;
            while(n2!=0)
            {
              int r=n2%10;
              p=p*r;
              n2=n2/10;
            }
            if(p%t==0)
            {
                ans=i;
                break;
            }
        }
    return ans;
        
    }
}