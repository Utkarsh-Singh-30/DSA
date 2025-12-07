1/*
2// Definition for a Node.
3class Node {
4public:
5    int val;
6    Node* next;
7    Node* random;
8    
9    Node(int _val) {
10        val = _val;
11        next = NULL;
12        random = NULL;
13    }
14};
15*/
16
17/*
18// Definition for a Node.
19class Node {
20public:
21    int val;
22    Node* next;
23    Node* random;
24    
25    Node(int _val) {
26        val = _val;
27        next = NULL;
28        random = NULL;
29    }
30};
31*/
32
33class Solution {
34public:
35    Node* copyRandomList(Node* head) {
36        Node* temp = head;
37        Node* ans = new Node(-1);
38        Node* temp2 = ans;
39        while(temp != NULL) {
40            Node* newNode = new Node(temp->val);
41            temp2->next = newNode;
42            temp2 = newNode; 
43            temp = temp->next;
44        }
45        ans = ans->next;
46        temp2 = ans;
47        temp = head;
48
49        Node* temp3 = temp;
50        while(temp != NULL && temp2 != NULL) {
51            temp3 = temp;
52            temp = temp->next;
53            temp3->next = temp2;
54            temp3 = temp2;
55            temp2 = temp2->next;
56            temp3->next = temp;
57        }
58        temp = head;
59        temp2 = ans;
60
61        while(temp != NULL && temp2 != NULL) {
62            if(temp->random == NULL) {
63                temp2->random = NULL;
64            }else {
65                temp2->random  = temp->random->next;
66            }
67
68            temp = temp2->next;
69            if(temp != NULL) 
70            temp2 = temp->next;
71        }
72        temp = head;
73        temp2 =ans;
74
75        while(temp != NULL && temp2 != NULL) {
76            temp->next = temp2->next;
77            temp = temp->next;
78            if(temp == nullptr)
79            break;
80            temp2->next = temp->next;
81            if(temp2 == NULL) break;
82            temp2 = temp->next;
83        }
84
85        return ans;
86    }
87};