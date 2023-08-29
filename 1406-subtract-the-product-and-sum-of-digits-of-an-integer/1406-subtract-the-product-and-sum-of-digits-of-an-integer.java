class Solution {
    public int subtractProductAndSum(int n) {
        int pro = 1, sum = 0;
        while(n>0)
        {
            int ls = n%10;
            pro *= ls;
            sum += ls;
            n /= 10;
        }
        return pro-sum;
    }
}