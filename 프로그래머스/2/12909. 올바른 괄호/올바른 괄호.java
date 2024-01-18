class Solution {
    boolean solution(String s) {
        int len = s.length();
        
        if(len % 2 != 0){ 
            return false;
        }
        if(s.substring(0,1).equals(")") || s.substring(len-1).equals("(")) { 
            return false;
        }
        if(len - s.replace(")","").length() != len/2){
            return false;
        }
        if(len - s.replace("(","").length() != len/2){
            return false;
        }
                
        int flag = 0;
        for(int i=0; i<len; i++){
            flag += s.charAt(i) == ')' ? -1 : 1;
            if(flag < 0){
                return false;
            }
        }
        
        
        return true;
    }
}