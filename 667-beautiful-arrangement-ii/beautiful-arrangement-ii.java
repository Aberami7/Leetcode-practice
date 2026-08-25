class Solution {
    public int[] constructArray(int n, int k) {
        int[] nums=new int[n];
        int l=1;
        int r=k+1;
        int ind=0;
        while(l<=r)
        {
            nums[ind++]=l++;
            if(l<=r)
            {
                nums[ind++]=r--;
            }
        }
            int a=k+2;
            while(a<=n)
            {
                nums[ind++]=a++;
            }
        
        return nums;
    }
}