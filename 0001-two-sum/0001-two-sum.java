class Solution {
    public int[] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap();
        for(int i=0; i<arr.length; i++)
        {
            map.put(arr[i], i);
        }

        for(int i =0; i<arr.length; i++)
        {
            int rem = target - arr[i];
            if(map.containsKey(rem))
            {
                int index = map.get(rem);
                if(index == i)
                {
                    continue;
                }
                return new int[]{i, index};
            }
        }
        return new int[]{};
    }
}