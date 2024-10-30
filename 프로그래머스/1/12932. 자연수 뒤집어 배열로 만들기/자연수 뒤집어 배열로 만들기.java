import java.util.*;

class Solution {
    public int[] solution(long n) {
       
        String[] arr = Long.toString(n).split("");
        List<String> list = Arrays.asList(arr);
        Collections.reverse(list);
        int[] answer = new int[arr.length];
        for(int i=0; i<arr.length; i++) {
            answer[i] = Integer.valueOf(list.get(i));
        }

        return answer;
    }
}