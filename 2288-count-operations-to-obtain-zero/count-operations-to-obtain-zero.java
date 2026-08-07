class Solution {
    public int countOperations(int num1, int num2) {
        int count=0;
        while(num1!=0 && num2!=0)
        {
            int n=0;
            if(num1>num2){
                 n=num1-num2;
                 num1=n;
            }
            else
            {
                n=num2-num1;
                num2=n;
            }
     
        count++;
        }
        return count;
}
}