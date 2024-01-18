import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        
        Arrays.sort(A);
        Arrays.sort(B);
        int len = A.length;
        for(int i=1; i<=len; i++){
            int mul = A[i-1] * B[len-i];
            answer += mul;
        }
        
        
        return answer;
    }
}