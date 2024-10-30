function solution(arr1, arr2) {
    var answer = [];
    for(let i=0; i<arr1.length; i++) {
        let arr = [];
        for(let y=0; y<arr1[i].length; y++) {
            arr.push( arr1[i][y] + arr2[i][y] );
        }
        answer.push(arr);
    }
    return answer;
}