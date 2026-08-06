class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
          
        char[] ch=new char[26];
         int i=0;

        for(char c='a';c<='z';c++)
        {
            ch[i++]=c;
        }
            Map<Character,Integer> map=new HashMap<>();
        for(int j=0;j<26;j++)
        {
            map.put(ch[j],weights[j]);
        }
        String str="";
        for(int k=0;k<words.length;k++)
        {
            String s=words[k];
            int sum=0;
            for(int j=0;j<s.length();j++)
            {
                sum+=map.get(s.charAt(j));
              
            }
 
            int val=sum%26;
           char z=(char)('z'-val);
           str+=z;
          
        }
        return str;
        
    }
}