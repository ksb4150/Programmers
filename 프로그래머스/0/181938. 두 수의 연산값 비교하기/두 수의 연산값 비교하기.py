def solution(a, b):
    num1 = str(a) + str(b)
    num2 = 2 * a * b
    answer = 0;
    if int(num1) > num2:
        answer = num1
    else :
        answer = num2
    return int(answer)