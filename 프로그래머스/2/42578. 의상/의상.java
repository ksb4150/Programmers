import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;

        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<clothes.length; i++) {
            int cnt = 1;
            if(map.containsKey(clothes[i][1])){
                cnt = map.get(clothes[i][1]) + 1;
            }
            map.put(clothes[i][1], cnt);
        }

        for(String key : map.keySet()) {
            answer *= map.get(key) + 1;
        }
                
        return answer-1;
    }
}