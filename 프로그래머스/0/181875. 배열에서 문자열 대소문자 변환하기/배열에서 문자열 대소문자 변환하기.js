function solution(strArr) {
    return strArr.map((item, idx) => {
        if (idx % 2 != 0) {
            return item.toUpperCase()
        } else {
            return item.toLowerCase() 
        } 
    })
}