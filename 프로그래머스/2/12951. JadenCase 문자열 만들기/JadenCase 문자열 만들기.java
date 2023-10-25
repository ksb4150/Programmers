import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] strArr = s.split(" ", -1);
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<strArr.length; i++) {
            if(strArr[i].length() > 0) {
                sb.append(strArr[i].split("")[0].toUpperCase()).append(strArr[i].substring(1).toLowerCase()).append(" ");
            } else {
                sb.append(" ");
            }
        }
        return sb.substring(0, sb.length()-1).toString();
    }
}