class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int a:arr)
        {
            map.put(a,map.getOrDefault(a,0)+1);
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]!=arr[j] && map.get(arr[i]).equals(map.get(arr[j])))
                {
                    return false;
                }
            }
        }
        return true;
    }
}