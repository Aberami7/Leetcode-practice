class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        List<String> list=new ArrayList<>();
        int min=Integer.MAX_VALUE;
        for(int i=0;i<list1.length;i++)
        {
            for(int j=0;j<list2.length;j++)
            {
                if(list1[i].equals(list2[j]))
                {
                    int sum=i+j;
                    if(min>sum)
                    {
                        min=sum;
                        list.clear();
                     list.add(list1[i]);
                   }
                   else if(min==sum)
                   {
                    list.add(list1[i]);
                   }
            }
        }
        }
        String[] str=new String[list.size()];
        int i=0;
        for(String n:list)
        {
            str[i]=n;
            i++;
        }
        return str;
        
    }
}