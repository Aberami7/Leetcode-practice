class Solution {
    public String[] findWords(String[] words) {
       
        List<String> list = new ArrayList<>();

        for(int i = 0; i < words.length; i++) {

            boolean b = true;

            String s = words[i];
            s = s.toLowerCase();

            char[] z = s.toCharArray();

            String row = "";

            if("qwertyuiop".contains(String.valueOf(z[0]))) {
                row = "qwertyuiop";
            }
            else if("asdfghjkl".contains(String.valueOf(z[0]))) {
                row = "asdfghjkl";
            }
            else {
                row = "zxcvbnm";
            }

            for(int j = 1; j < z.length; j++) {

                if(!row.contains(String.valueOf(z[j]))) {
                    b = false;
                    break;
                }
            }

            if(b) {
                list.add(words[i]);
            }
        }
         String[] v=new String[list.size()];
         int i=0;
        for(String f:list)
        {
            v[i++]=f;
        }
        return v;
    }
}