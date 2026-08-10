class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> list=new ArrayList<>();
        list.add(nums[0]);
        List<Integer> list1=new ArrayList<>();
        list1.add(nums[1]);
        for(int i=2;i<nums.length;i++)
        {
            if(list.get(list.size() - 1)>list1.get(list1.size()-1))
            {
                list.add(nums[i]);
            }
            else
            {
                list1.add(nums[i]);
            }
        }
        list.addAll(list1);
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            arr[i]=list.get(i);
        }



        return arr;
        
    }
}