function solution(arr)
{
    var answer = [];

    arr.forEach((item, idx) => {
        if(idx > 0){
            if(item != arr[idx-1]){
                answer.push(item);
            }
        } else {
            answer.push(item);
        }
    });
    
    return answer;
}