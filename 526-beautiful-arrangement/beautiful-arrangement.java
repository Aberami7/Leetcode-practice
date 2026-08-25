class Solution {
    int count=0;
    public int countArrangement(int n) {
        boolean[] b=new boolean[n+1];
        backtrack(1,b,n);
        return count;
    }

    public void backtrack(int pos,boolean[] b,int n)
    {
        if(pos>n)
        {
            count++;
            return;
        }
        for(int i=1;i<=n;i++)
        {
            if(!b[i] &&(i%pos==0 || pos%i==0))
            {
                b[i]=true;
                backtrack(pos+1,b,n);
                b[i]=false;
            }
        }
    }
    
    }        
    