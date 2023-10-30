import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];

        while(s.length() != 1) {
            answer[1] += s.length() - s.replace("0", "").length();
            s = s.replace("0", "");
            int binary = s.length();
            s = Integer.toBinaryString(binary);
            answer[0]++;
        }
        return answer;
    }
}