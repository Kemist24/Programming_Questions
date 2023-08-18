class Solution {
    public int majorityElement(int[] arr) {
        Arrays.sort(arr);
        int count = 1;
        int k = 0;

        if(arr.length == 1)
        {
            return arr[0];
        }
        for(int i =0; i<arr.length-1; i++)
        {
            if(arr[i]==arr[i+1])
            {
                count++; 
                if(count>(arr.length)/2)
        {
             k = arr[i];
        }
               
            }
            else{
                count = 1;
            }
        }
        if(count>(arr.length)/2)
        {
            return k;
        }
        return k;
    }
}