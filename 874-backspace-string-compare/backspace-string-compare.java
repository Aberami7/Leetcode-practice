class Solution {
    public boolean backspaceCompare(String s, String t) {
         
          StringBuilder sb=new StringBuilder();
         if(s.charAt(0)!='#')
         {
            sb.append(s.charAt(0));
         }
         for(int i=1;i<s.length();i++)
         {
              if(s.charAt(i)=='#')
              {
                if(sb.length()>0)
                {
                sb.deleteCharAt(sb.length()-1);
                }
              }
              else{
                  sb.append(s.charAt(i));
              }
         } 
          StringBuilder sb1=new StringBuilder(); 
          if(t.charAt(0)!='#')
         {
            sb1.append(t.charAt(0));
         }
         for(int i=1;i<t.length();i++)
         {
              if(t.charAt(i)=='#')
              {
                if(sb1.length()>0){
                sb1.deleteCharAt(sb1.length()-1);
                }
              }
              else{
                  sb1.append(t.charAt(i));
              }
         }  
         if(sb.toString().equals(sb1.toString()))
         {
            return true;
         }
         return false;
    }
}