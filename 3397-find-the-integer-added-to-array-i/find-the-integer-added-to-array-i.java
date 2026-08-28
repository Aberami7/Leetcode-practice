class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int min1=nums1[0];
        int min2=nums2[0];
        for(int a:nums1)
        {
            min1=Math.min(a,min1);
        }
        for(int a:nums2)
        {
            min2=Math.min(min2,a);
        }
        return min2-min1;
    }
}