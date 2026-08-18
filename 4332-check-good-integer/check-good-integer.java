class Solution {
    public boolean checkGoodInteger(int n) {
        int sum=0;
        int sqr=0;
         while(n>0)
         {
            int r=n%10;
            sum+=r;
            sqr+=r*r;
            n=n/10;
         }
         int a=sqr-sum;
         return a>=50;
        
    }
}