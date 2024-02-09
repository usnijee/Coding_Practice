'''
거리
    pile1 => 1
    pile2 => 2,3,4,5,6,7 (6개),, 7 = 1 + 6*1
    pile3 => 8~19 (12개 ) ,,     19 =  7 + 6*2
    pile4 => 20~37 (18개)
    pile5 => 38~61 (24개)

풀이> 
'''

N = int(input())                 ## 입력값 받기
pile_lstnum = 1                  ## 초기 숫자 1의 벌집 개수는 1개, 정확히 말하면 거리에 포함되는 숫자중 마지막 수를 의미
pile_cnt = 1                     ## pile 즉, 거리 값
while N > pile_lstnum:           ## N이 pile의 마지막 수(1,7,19,37,61)보다 크다면 
   pile_lstnum += 6 * pile_cnt   ## 벌집이 6의 배수로 증가 (1,7,19,37)
   pile_cnt += 1                 
print(pile_cnt)