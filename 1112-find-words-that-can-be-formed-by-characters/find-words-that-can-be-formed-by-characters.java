class Solution {
    public int countCharacters(String[] words, String chars) {
        int sum=0;
        for(int i=0;i<words.length;i++)
        {
            String s=words[i];
            boolean b=true;
              String temp = chars;

            for (int j = 0; j < s.length(); j++) {

                int index = temp.indexOf(s.charAt(j));

                if (index == -1) {
                    b = false;
                    break;
                }
                temp = temp.substring(0, index) + temp.substring(index + 1);
            }
            if(b)
            {
                sum+=s.length();
            }
        }
        return sum;
    }
}