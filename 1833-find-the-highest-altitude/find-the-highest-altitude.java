class Solution {
    public int largestAltitude(int[] gain) {
        int[] p=new int[gain.length+1];
        p[0]=0;
        int max=0;
        for(int i=1;i<p.length;i++)
        {
            p[i]=p[i-1]+gain[i-1];
            max=Math.max(max,p[i]);
           
        }
        return max;
        

        
    }
}