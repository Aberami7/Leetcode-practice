class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
       paragraph=paragraph.replaceAll("[^A-Za-z ]"," ");
      paragraph=paragraph.toLowerCase();
      
     String[] str=paragraph.split("\\s+");
    String z="";
    Map<String,Integer> map=new HashMap<>();
    for(String n:str)
    {
        map.put(n,map.getOrDefault(n,0)+1);
    }
    Set<String> set = new HashSet<>();

         for(String word : banned)
       {
             set.add(word);
           }
    int max=0;
    for(Map.Entry<String,Integer> entry:map.entrySet())
    {
        if(set.contains(entry.getKey()))
        {
            continue;
        }
        else if(entry.getValue()>max)
        {
            max=entry.getValue();
            z=entry.getKey();
        }
    }
     return z;
    }
}
        
