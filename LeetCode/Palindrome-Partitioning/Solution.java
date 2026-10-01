1class Solution {
2    public List<List<String>> partition(String s) {
3        List<List<String>> ans = new ArrayList<>();
4        List<String> path = new ArrayList<>();
5
6        func(0,s,ans, path);
7        return ans;
8    }
9
10    public void func(int idx, String s, List<List<String>> ans, List<String> path){
11        if(idx==s.length()){
12            ans.add(new ArrayList<>(path));
13            return;
14        }
15
16        for(int i =idx;i<s.length();i++){
17            if(isPalin(s,idx,i)){
18                path.add(s.substring(idx,i+1));
19                func(i+1,s,ans,path);
20                path.remove(path.size()-1);
21            }
22        }
23    }
24
25    public boolean isPalin(String s, int i,int j){
26        while(i<=j){
27            if(s.charAt(i)!=s.charAt(j)) return false;
28            i++;
29            j--;
30        }
31        return true;
32    }
33}