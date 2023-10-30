import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int zero = 0;
        int cnt = 0;
        while(s.length() != 1) {
            zero += s.length() - s.replace("0", "").length();
            s = s.replace("0", "");
            int binary = s.length();
            s = Integer.toBinaryString(binary);
            cnt ++;
        }
        answer[0] = cnt;
        answer[1] = zero;
        return answer;
    }
}