def solution(n):
    answer = 0
    for a in range(0, n+1, 2):
        answer += a
    return answer