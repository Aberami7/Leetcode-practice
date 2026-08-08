class Solution {
    public String frequencySort(String s) {
    char ch[]=s.toCharArray();
     Map<Character,Integer> map=new HashMap<>();
         for(char a:ch)
         {
            map.put(a,map.getOrDefault(a,0)+1);

         }
        StringBuilder sb=new StringBuilder();
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a,b)->b.getValue()-a.getValue());
        for (int j = 0; j < list.size(); j++) 
        { 
        int count = list.get(j).getValue(); 
        char c = list.get(j).getKey();
        for (int i = 0; i < count; i++)
        {  
            sb.append(c);
        }
        }
        return sb.toString();
    }
}