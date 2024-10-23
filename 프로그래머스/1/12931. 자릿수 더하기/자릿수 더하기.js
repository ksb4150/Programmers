function solution(n)
{
    let num = n.toString().split("");
    return num.reduce((acc, cur) => {return parseInt(cur) + acc}, 0);
}