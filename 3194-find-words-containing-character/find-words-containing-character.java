class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        String z="";
        z+=x;
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<words.length;i++)
        {
            if(words[i].contains(z))
            {
                list.add(i);
            }
        }
        return list;
        
    }
}