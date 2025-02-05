def solution(slice, n):
    for i in range(100):
        if i * slice >= n:
            return i
