class Solution {
    public String solution(String phone_number) {
        String chgStr = phone_number.substring(0, phone_number.length()-4);
        String starStr = "";
        for(int i=0; i<chgStr.length(); i++){
            starStr += "*";
        }
        phone_number = phone_number.replace(chgStr, starStr);
        
        return phone_number;
    }
}