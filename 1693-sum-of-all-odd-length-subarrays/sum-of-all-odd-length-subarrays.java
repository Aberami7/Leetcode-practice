class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
    
        for(int i=2;i<=arr.length;i++)
        {
        
            if(i%2!=0)
            {
            for(int j=0;j<=arr.length-i;j++)
            {
            int[] num=new int[i];
             num=Arrays.copyOfRange(arr,j,j+i);
            
             for(int a:num)
                 {
                     sum+=a;
                 }
            }
            }
            
        }
        return sum;
    }
}