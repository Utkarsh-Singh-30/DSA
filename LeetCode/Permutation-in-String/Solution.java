1class Solution {
2    public boolean checkInclusion(String s1, String s2) {
3	    if(s1.length() > s2.length()) return false;
4        
5        int[] arr1 = new int[26];
6        int[] arr2 = new int[26];
7        
8        for(int i = 0; i < s1.length(); i++){
9            arr1[s1.charAt(i) - 'a']++;
10            arr2[s2.charAt(i) - 'a']++;
11        }
12        
13        if(Arrays.equals(arr1, arr2)) return true;
14        
15        int front = 0;
16        int back = s1.length();
17        while(back < s2.length()){
18            arr2[s2.charAt(front) - 'a']--;
19            arr2[s2.charAt(back) - 'a']++;
20            
21            if(Arrays.equals(arr1, arr2)) return true;
22            front++;
23            back++;
24        }
25        return false;
26
27        // if(code.length()>letter.length()) return false;
28
29        // Map<Character, Integer> map = new HashMap<>();
30        // for(int i=0;i<code.length();i++){
31        //     char ch = code.charAt(i);
32        //     if(!map.containsKey(ch)) map.put(ch, 1);
33        //     else map.put(ch, map.get(ch)+1);
34        // }
35        // int tc= code.length();
36
37        // for(int i=0;i<letter.length();i++){
38        //     if(map.containsKey(letter.charAt(i))){
39        //         while(map.containsKey(letter.charAt(i))){ tc--;
40        //         i++;
41        //         }
42        //     }
43        //     if(tc==0) return true;
44        //     else tc=code.length();
45        // }
46        // return false;
47
48    }
49}