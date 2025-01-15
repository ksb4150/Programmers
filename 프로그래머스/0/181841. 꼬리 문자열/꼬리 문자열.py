def solution(str_list, ex):
    answer = ''
    for i in str_list:
        if i.find(ex) > -1:
            answer += ''
        else:
            answer += i
    return answer