1class Solution {
2    public boolean isPalindrome(int x) {
3        if(x<0) return false;
4        long reversed=0;
5        long temp=x;
6        while(temp>0){
7            int digit= (int) temp%10;
8            reversed= reversed *10 +digit;
9            temp/=10;
10        }
11        return reversed==x;
12    }
13}