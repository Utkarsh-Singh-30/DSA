1class Solution {
2    public boolean isAnagram(String s, String t) {
3        if(s.length()!=t.length())
4            return false;
5        int []arr= new int[26];
6        for(int i=0;i<s.length();i++){
7            char ch =s.charAt(i);
8            arr[ch-'a']++;
9        }
10        for(int i=0;i<t.length();i++){
11            char ch = t.charAt(i);
12            arr[ch-'a']--;
13        }
14        for(int i:arr){
15            if(i!=0) return false;
16        }
17        return true;
18    }
19}