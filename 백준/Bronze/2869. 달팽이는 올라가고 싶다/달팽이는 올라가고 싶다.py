# v = (a-b)*(x-1)+a = ax-bx+b
# x = (v-b)/(a-b)
# x가 정수라면 x일 걸림 but x가 정수가 아니라면 +1을 해야함 

a,b,v = map(int,input().split())

x = (v-b)/(a-b)       # / : 실수반환 // : 정수반환 
if x == int(x):
    print(int(x))
else:
    print(int(x)+1)