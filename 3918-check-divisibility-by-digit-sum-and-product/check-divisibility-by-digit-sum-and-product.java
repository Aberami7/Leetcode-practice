class Solution {
    public boolean checkDivisibility(int n) {
        int s=0;
        int p=1;
        int n1=n;
        while(n!=0)
        {
            int r=n%10;
            s+=r;
            p*=r;
            n=n/10;
        }
        int a=s+p;
        if(n1%a==0)
        {
            return true;
        }
        return false;
        
    }
}