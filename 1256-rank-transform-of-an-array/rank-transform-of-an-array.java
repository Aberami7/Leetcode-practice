class Solution {
    public int[] arrayRankTransform(int[] arr) {
       int[] arr2=Arrays.copyOf(arr,arr.length);
       Arrays.sort(arr);
        int[] num=new int[arr.length];
        Map<Integer,Integer> map=new HashMap<>();
        int r=1;
        for(int i=0;i<arr.length;i++)
        {
            if(!map.containsKey(arr[i])){
            map.put(arr[i],r++);
            }
        }
        int i=0;
       for(int a:arr2)
       {
        num[i++]=map.get(a);
       }
        return num;
        
    }
}