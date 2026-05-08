1class Solution:
2    def isValid(self, s: str) -> bool:
3        stack=[]
4        for i in range(0,len(s)):
5            if s[i]=='(' or s[i]=='{' or s[i]=='[':
6                stack.append(s[i])
7            else:
8                if len(stack)==0:
9                    return False
10                elif s[i]==')' and stack[-1]=='(': stack.pop()
11                elif s[i]=='}' and stack[-1]=='{': stack.pop()
12                elif s[i]==']' and stack[-1]=='[': stack.pop()
13                else: return False
14        if len(stack)==0:
15            return True