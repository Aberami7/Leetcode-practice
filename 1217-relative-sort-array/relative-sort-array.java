class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int ind=0;
        int[] arr=new int[arr1.length];
        for(int i=0;i<arr2.length;i++)
        {
            for(int j=0;j<arr1.length;j++)
            {
                if(arr2[i]==arr1[j])
                {
                    arr[ind++]=arr1[j];
                    System.out.print(arr1[j]);
                }
            }
        }
        Arrays.sort(arr1);
       
        for(int i=0;i<arr1.length;i++)
        {
            boolean b=false;
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j])
                {
                    b=true;
                    break;
                }
            }
            
             if(!b){
                    arr[ind++]=arr1[i];
                }
            
                 }
        
            
        

        return arr;
        
    }
}