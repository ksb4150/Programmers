import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int cnt = 1;
        while(cnt <= n){ 
            int sum = 0;
            for(int i = cnt; i <= n; i++) {
               sum += i;
                if(sum == n){
                    answer++;
                    cnt++;
                    break;
                } else if(sum > n){
                    cnt++;
                    break;
                }
            
            } 
        }
        
        
        
        return answer;
    }
}