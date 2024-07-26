import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int catchSize = nums.length / 2;
        
         Set<Integer> pokeTypes = new HashSet<>();
        for(int i : nums){
            pokeTypes.add(i);
        }
        
        return catchSize > pokeTypes.size() ? pokeTypes.size() : catchSize;
    }
}