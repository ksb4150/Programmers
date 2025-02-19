def solution(num_list):
    hol = ''
    zzac = ''
    for num in num_list :
        if num % 2 != 0 :
            hol += str(num)
        else :
            zzac += str(num)
    return int(hol) + int(zzac)