class Solution {
    public int[] solution(String s) {
        int[] answer = { 0,0 };
        int zeroCnt = 0;
        int changeCnt = 0;
        
        while(s.length() > 1){
            answer[0]++;
            int cnt = s.replace("0", "").length();
            answer[1] += s.length() - s.replaceAll("0", "").length();
            String str = s.replaceAll("0", "");
            int len = str.length();
            if(len == 1){
                break;                
            }
            String binaryString = Integer.toBinaryString(len);
            s = binaryString;
        }
        
        
        return answer;
    }
}