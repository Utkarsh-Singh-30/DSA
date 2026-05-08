1class Solution {
2    public boolean isValid(String s) {
3       Stack<Character> st = new Stack<>();
4        for(int i =0;i<s.length();i++){
5            if(s.charAt(i)=='(' || s.charAt(i)=='{' ||s.charAt(i)=='[')
6                st.push(s.charAt(i));
7            else{
8                if(st.isEmpty()) return false;
9                else if(s.charAt(i)==')'&& st.peek()=='(') st.pop();
10                else if(s.charAt(i)=='}'&& st.peek()=='{') st.pop();
11                else if(s.charAt(i)==']'&& st.peek()=='[') st.pop();
12                else return false;
13            }
14        }
15        if(st.isEmpty()) return true;
16        else return false;
17    }
18}