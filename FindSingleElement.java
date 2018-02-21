/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allleetcodeprojects;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Asus
 */
public class FindSingleElement { //DONE
    public int singleNumber(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<nums.length;i++){
            if(list.contains(nums[i])){
                list.remove(new Integer(nums[i]));
            }
            else{
                list.add(nums[i]);
            }
        }
        return list.get(0);
    }
}
