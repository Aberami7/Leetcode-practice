class Solution {
    public int[] frequencySort(int[] nums) {
        int[] arr=new int[nums.length];
        Map<Integer,Integer> map=new HashMap<>();
        for(int a:nums)
        {
            map.put(a,map.getOrDefault(a,0)+1);
        }
        int max=0;
        List<Map.Entry<Integer,Integer>> list=new ArrayList<>(map.entrySet());
        list.sort((a, b) -> {
    if (!a.getValue().equals(b.getValue())) {
        return a.getValue() - b.getValue();
    }
    return b.getKey() - a.getKey();
});
       int index = 0;
        for (Map.Entry<Integer, Integer> entry : list) {
       for (int j = 0; j < entry.getValue(); j++) {
          arr[index++] = entry.getKey();
    }
        }
    return arr;
}
    }