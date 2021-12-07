package Searching;

import java.util.ArrayList;
import java.util.List;

public class MajorityElement2 {
    public static void main(String[] args) {
        int[] a = {10, 10, 20, 20, 10, 20};
        System.out.println(majorityElement(a).toString());
    }
    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int c1 = 0, c2 = 0;
        int m1 = Integer.MAX_VALUE, m2 = Integer.MIN_VALUE;
        for(int i = 0;i<nums.length;i++){
            if(m1 == nums[i]){
                c1++;
            }else if(m2 == nums[i]){
                c2++;
            }else if(c1 == 0){
                m1 = nums[i];
                c1 = 1;
            }else if(c2 == 0){
                m2 = nums[i];
                c2 = 1;
            }else{
                c1--;
                c2--;
            }
        }

        c1 = 0;
        c2 = 0;
        for(int i = 0;i<nums.length;i++){
            if(m1 == nums[i]){
                c1++;
            }
            else if(m2 == nums[i]){
                c2++;
            }
        }
        if(c1 > nums.length / 3){
            result.add(m1);
        }
        if(c2 > nums.length / 3){
            result.add(m2);
        }
        return result;
    }
}
