function solution(arr) {
    var answer = [];
    let min = Math.min.apply(null, arr);
    answer = arr.filter((item) => item != min);
    return answer.length == 0 ? [-1] : answer;
}