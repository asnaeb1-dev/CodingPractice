package Strings;
import java.util.*;
public class MaximumOccuringCharacter {
    public static char getMaxOccuringChar(String line){
        int[] count = new int[26];
        Arrays.fill(count, 0);
        for(int i = 0;i<line.length();i++){
            count[line.charAt(i) - 97]++;
        }

        int max = 0;
        char ch = '1';
        for(int i = 0;i<count.length;i++){
            if(count[i] > max){
                max = count[i];
                ch = (char) (i + 97);
            }else if(count[i] == max){
                if(i + 97 < ch){
                    ch = (char) (i + 97);
                }
            }
        }
        return ch;
    }
}
