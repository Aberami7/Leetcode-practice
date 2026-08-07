class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
      List<Integer> list=new ArrayList<>();
        for(int i=left;i<=right;i++)
        {
             boolean b=true;
            int n=i;
            while(n!=0)
            {
                
                int r=n%10;
                if(r==0 || i%r!=0)
                {
                   b=false; 
                   break;
                }
                n=n/10;
            }
            if(b)
            {
                list.add(i);
            }
        }
           return list;
    }
}


