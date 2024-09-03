function solution(clothes) {
    const clothesMap = new Map();
    let count = 1;
    
    clothes.map(([item, type]) => {
        if (clothesMap.has(type)) {
            clothesMap.set(type, [...clothesMap.get(type), item])
        } else {
            clothesMap.set(type, [item])
        }
    });
   
    clothesMap.forEach(value => {
        count *= value.length + 1;
    });
    
    return count - 1;
}