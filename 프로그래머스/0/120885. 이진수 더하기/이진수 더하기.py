def solution(bin1, bin2):
    hap = int(bin1,2)+int(bin2,2)
    hap_to_leejinsu = bin(hap)
    answer = f"{hap_to_leejinsu[2:]}"
    return answer

