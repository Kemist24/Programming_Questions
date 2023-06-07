class Solution {
    public int trailingZeroes(int n) {
         int res =0;
        for (int i =5; i<=n; i = i*5) 
        /* by dividing with 5 we get no. of 5 till that no. and 
        when 25 comes we need to divide by 25 as there are 2 5's in 25 and so on like 125 625  etc only when n is greater than these no.s thats why we are doing i=i*5 
        */
        {
            res = res+(n/i);
        }
        return res;
    }
}