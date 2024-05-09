import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList());
        for(int i=0; i<=9; i++){
            int index = list.indexOf(i);
            answer += index < 0 ? i : 0;
        }

        
        return answer;
    }
}