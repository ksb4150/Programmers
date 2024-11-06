function solution(s) {
    var answer = s.split(" ").reduce((acc, cur, idx, arr) => {
        let str = cur.split("").reduce((acc1, cur1, idx1) => {
            if(idx1 % 2 != 0)
               return acc1 + cur1.toLowerCase();
            else 
                return acc1 + cur1.toUpperCase();
        }, '');
        let pad = arr.length - 1 != idx ? " " : "";
        return acc + str + pad;
    }, '')
    
    return answer;
}