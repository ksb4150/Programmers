function solution(progresses, speeds) {
    var answer = [];
    let resultList = progresses.map((progressItem, idx) => {
        let speed = speeds[idx];
        let result = progressItem;
        let cnt = 0;
        while(progressItem < 100) {
            cnt++;
            progressItem += speed;
        }
        return cnt;
    });
    
    let start = resultList[0];
    let cnt = 0;
    for(let i=0; i<resultList.length; i++){
        let curVal = resultList[i];
        if(curVal <= start){
            cnt++;
        } else {
            answer.push(cnt);
            start = curVal;
            cnt = 1;
        }
    }
    answer.push(cnt);
    return answer;
}