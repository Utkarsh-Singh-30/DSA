1class Solution:
2    def isValid(self, s: str) -> bool:
3        n= len(s)
4        st= []
5
6        for i in range(n):
7            if s[i] in {'(','{','['}:
8                st.append(s[i])
9
10            else:
11                if len(st) == 0: return False 
12                elif(s[i]==')' and st[len(st)-1])=='(': st.pop()
13                elif(s[i]=='}' and st[len(st)-1])=='{': st.pop()
14                elif(s[i]==']' and st[len(st)-1])=='[': st.pop()
15                else: return False
16
17        if len(st) == 0: return True
18        else: return False
19