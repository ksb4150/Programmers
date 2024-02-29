class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int len = s.length();
        s = s.toLowerCase();
        
        if(!s.contains("p") && !s.contains("y")){
            return true;
        }
                
        if(len - s.replace("p", "").length() != len - s.replace("y", "").length()){
            return false;
        }


        return answer;
    }
}