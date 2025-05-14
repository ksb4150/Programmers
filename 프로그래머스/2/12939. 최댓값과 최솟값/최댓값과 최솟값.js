function solution(s) {
    let arr = s.split(" ").map(Number);
    console.log(arr)
    let answer = Math.min(...arr) + " " + Math.max(...arr);
    return answer;
}