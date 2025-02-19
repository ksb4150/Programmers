function solution(arr, n) {
    let len = arr.length;
    
    let answer = arr.map((item, index) => {
        if(len % 2 != 0 && index % 2 == 0) {
            item += n;
        } else if(len % 2 == 0 && index % 2 != 0) {
            item += n;
        }
        return item;
    })
   return answer;
}