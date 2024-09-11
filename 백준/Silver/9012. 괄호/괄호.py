class stack(object):
    def __init__(self):
        self.s = []
    
    def insert(self, v):
        self.s.append(v)
    
    def remove(self):
        self.s.pop()

num = int(input())
for _ in range(num):
    stackk = stack()
    s = input()
    for idx, i in enumerate(s):
        if i == '(':
            stackk.insert(i)
            if idx == len(s)-1:
                print("NO") 
        elif i == ')':
            if len(stackk.s) >= 1 :
                stackk.remove()
                if (len(stackk.s) == 0) and (idx == len(s)-1):
                    print("YES") 
                elif (len(stackk.s) != 0) and (idx == len(s)-1):
                    print("NO")  
            else:
                print("NO")
                break
