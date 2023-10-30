class Solution {
    boolean solution(String s) {
        boolean answer = true;

        char[] arr = s.toCharArray();
        
        int flag = 0;
        for(int i =0; i<arr.length; i++) {
            flag += arr[i] == '(' ? 1 : -1;
            if(flag == -1) {
            	break;
            }
        }

        return flag != 0 ? false : true;
    }
}