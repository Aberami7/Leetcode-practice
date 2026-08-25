class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] k=s1.split(" ");
        String[] l=s2.split(" ");

        Map<String,Integer> map=new HashMap<>();
        List<String> list=new ArrayList<>();
        for(String a:k)
        {
            list.add(a);
        }
        for(String a:l)
        {
            list.add(a);
        }
        for(String a:list)
        {
            map.put(a,map.getOrDefault(a,0)+1);
        }
        List<String> z=new ArrayList<>();
        for(String a:list)
        {
              if(map.get(a)==1)
              {
                z.add(a);
              }
        }
        String[] c=new String[z.size()];
        int i=0;
        for(String a:z)
        {
            c[i++]=a;
        }
        return c;

        
    }
}