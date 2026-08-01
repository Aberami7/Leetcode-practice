class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j])
                {
                          set.add(nums1[i]);
                }
            }
        }
        int[] arr =new int[set.size()];
        int i=0;
        for(int a:set)
        {
            arr[i]=a;
            i++;
        }
/*int[] arr = set.stream()
                .mapToInt(Integer::intValue)
                .toArray();*/
        return arr;
    
}
}
 