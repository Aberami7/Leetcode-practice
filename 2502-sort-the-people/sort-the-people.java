class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        String[] str=new String[names.length];
        Map<Integer,String> map=new HashMap<>();
       for(int i=0;i<names.length;i++)
      {
          map.put(heights[i],names[i]);
       }
       List<Map.Entry<Integer,String>> list=new ArrayList<>(map.entrySet());
       list.sort((a,b)->b.getKey().compareTo(a.getKey()));
       for(int i=0;i<list.size();i++)
       {
        str[i]=list.get(i).getValue();
       }
       return str;
        
    }
}