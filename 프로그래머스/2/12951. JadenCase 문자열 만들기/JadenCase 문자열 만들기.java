class Solution {
    public String solution(String s) {
        String answer = "";
        String[] strArr = s.split(" ", -1);
        for(int i=0; i<strArr.length; i++){
            String str = strArr[i];
            if(str.length() > 1){
                str = str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
            } else {
                str = str.substring(0).toUpperCase();
            }
            if(strArr.length - 1 != i) {
                str += " ";
            }
            answer += str;
        }
        return answer;
    }
}