import java.util.*;
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    
        int[] merge=new int[m+n];
        int index=0;
        for(int i=0;i<m;i++)
        {
           merge[index]=nums1[i];
           index++;
        }
        for(int i=0;i<n;i++)
        {
            merge[index]=nums2[i];
            index++;
        }
        Arrays.sort(merge);
        for(int i=0;i<merge.length;i++)
        {
            nums1[i]=merge[i];
        }
        System.out.print(Arrays.toString(nums1));
    

    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[] nums1=new int[m];
        int[] nums2=new int[n];
        for(int i=0;i<m;i++)
        {
            nums1[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
        nums2[i]=sc.nextInt();
        }
        Solution obj=new Solution();
        obj.merge(nums1,m,nums2,n);


    }
}
