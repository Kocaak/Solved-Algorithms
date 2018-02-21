/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allleetcodeprojects;

/**
 *
 * @author Asus
 */
public class ProductofArrayExceptSelf {
    
    //YAVAŞ ÇÖZÜM
    public int[] YavasProductExceptSelf(int[] nums) {

        if(nums.length < 1){
            return nums;
        }
        
        int[] output = new int[nums.length];
        int c = 0,sum=1;
        for(int i = 0; i<nums.length;i++){
            for(int j = 0; j<nums.length;j++){
                if(c != j){
                    sum *= nums[j];
                }
            }
            output[i] = sum;
            sum = 1;
            c++;
        }
        
        return output;
    }
    
    public int[] productExceptSelf(int[] nums) {
//DONE
        if (nums.length < 1) {
            return nums;
        }
        
        int[] output = new int[nums.length];
        int sum=1;
        
        for (int i = nums.length - 1; i >= 0; i--) {
            output[i] = sum;
            sum *= nums[i];
        }
        
        sum = nums[0];
        
        for(int i = 1; i<nums.length;i++){
            output[i] *= sum;
            sum *= nums[i];
        }
       
        return output;
    }
}
