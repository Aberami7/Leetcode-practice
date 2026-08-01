class Solution {
    public int[] singleNumber(int[] nums) {
        
        Map<Integer,Integer> map=new HashMap<>();
        for(int a:nums)
        {
            map.put(a,map.getOrDefault(a,0)+1);
        }
      List<Integer> list=new ArrayList<>();
      for(int a:nums)
      {
        if(map.get(a)==1)
        {
            list.add(a);
        }
      }
      int[] arr=new int[2];
      for(int i=0;i<list.size();i++)
      {
        arr[i]=list.get(i);
      }
   
        return arr;
        
    }
}