def solution(str_list, ex):
    answer = ''
    for str in str_list:
        if str.find(ex) > -1:
            answer += ''
        else:
            answer += str
    return answer