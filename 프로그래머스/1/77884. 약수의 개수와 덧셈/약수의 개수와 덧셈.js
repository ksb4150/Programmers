function solution(left, right) {
    var answer = 0;
    
    for(left; left <= right; left++) {
        let result = [];
        let index = 1;
        while(index <= left/2){
            if(left % index === 0)
                result.push(index);
            index++;
        }
        answer += (result.length + 1) % 2 == 0 ? +left : -left;
    }
    
    
    return answer;
}