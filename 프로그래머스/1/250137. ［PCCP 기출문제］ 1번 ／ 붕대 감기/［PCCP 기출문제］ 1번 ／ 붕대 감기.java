import java.util.*;
class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {    
        int curHealth = health;
        int lastAttack = attacks[attacks.length-1][0];
        int attackLen = attacks.length;
        int time = 1;
        int conti = 0;
        int attackCnt = 0;
        boolean healFlag = true;
        while(curHealth > 0 || lastAttack >= time){
           if(attacks[attackCnt][0] == time){
               curHealth -= attacks[attackCnt][1];
               if(curHealth < 0) {
                   return -1;
               }
               conti = 0;
               attackCnt++;
                healFlag = false;
               if(attackCnt == attackLen){
                   break;
               }
            }
            if(curHealth < health && healFlag){
                conti++;
                System.out.println("1: "+time);
                curHealth += bandage[1];
                System.out.println("2: "+curHealth);
                if(conti >= bandage[0]){
                    curHealth += bandage[2];
                    System.out.println("3: "+curHealth);
                }
                if(curHealth > health){
                    System.out.println("4: "+curHealth);
                    curHealth = health;
                }
            }
            time++;
            healFlag = true;
        }
        
        return curHealth <= 0 ? -1 : curHealth;
    }
}