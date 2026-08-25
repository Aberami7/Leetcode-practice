class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String,Integer> map=new HashMap<>();
        for(String a:arr)
        {
            map.put(a,map.getOrDefault(a,0)+1);
        }
        List<String> list=new ArrayList<>();
        for(String a:arr)
        {
             if(map.get(a)==1)
             {
                list.add(a);
             }
        }

        if(list.size()<k)
        {
            return "";
        }
        return list.get(k-1);
        
    }
}