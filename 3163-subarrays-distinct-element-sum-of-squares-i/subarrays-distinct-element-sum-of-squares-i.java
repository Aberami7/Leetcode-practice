class Solution {
    public int sumCounts(List<Integer> nums) {
        int sum=0;
        for(int i=0;i<nums.size();i++)
        {
            sum+=1;
        }
        int[] z=new int[nums.size()];
        int k=0;
        for(int a:nums)
        {
            z[k++]=a;
        }
        for(int i=0;i<nums.size();i++)
        {
           
            for(int j=i+1;j<nums.size();j++)
                {
                    int[] arr=new int[j];
                    arr=Arrays.copyOfRange(z,i,j+1);  
    
                    Set<Integer> set=new HashSet<>();
                    for(int a:arr)
                        {
                            set.add(a);
                            
                        }
                 
                      sum+=Math.pow(set.size(),2);
                      }
    }

        return sum;
    }
}
