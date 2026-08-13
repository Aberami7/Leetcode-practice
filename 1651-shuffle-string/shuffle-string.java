class Solution {
    public String restoreString(String s, int[] indices) {
        char[] ch=s.toCharArray();
        Map<Integer,Character> map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            map.put(indices[i],ch[i]);
        }
        Arrays.sort(indices);
        StringBuilder sb=new StringBuilder();
        for(int a:indices)
        {
           sb.append(map.get(a));
        }
        return sb.toString();
        
    }
}