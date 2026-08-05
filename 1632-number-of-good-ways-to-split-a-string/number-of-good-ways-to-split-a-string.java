class Solution {
    public int numSplits(String s) {
        Set<Character> set=new HashSet<>();
        int[] p=new int[s.length()];
        for(int i=0;i<p.length;i++)
        {
           set.add(s.charAt(i));
           p[i]=set.size();
        }
        set.clear();
        int[] su=new int[s.length()];
        
            for(int i=s.length()-1;i>=0;i--)
            {
                set.add(s.charAt(i));
                su[i]=set.size();
            }
        
        int count=0;
        for(int i=0;i<p.length-1;i++)
    
        {
            if(p[i]==su[i+1])
            {
                count++;
            }
        }
        return count;


        
    }
}