class Solution {

    public static boolean dec(ArrayList<Integer> list)
    {
        for(int i =0; i<list.size()-1; i++)
        {
            if(list.get(i)<list.get(i+1))
            {
                return false;
            }
        }
        return true;
    }
    public static boolean inc(ArrayList<Integer> list)
    {
        for(int i =0; i<list.size()-1; i++)
        {
            if(list.get(i)>list.get(i+1))
            {
                return false;
            }
        }
        return true;
    }



    public boolean isMonotonic(int[] nums) {
       

        

         ArrayList<Integer> list = new ArrayList<>();
        for (int value : nums) {
            list.add(value);
        }

        
       return inc(list) || dec(list);
    }
}