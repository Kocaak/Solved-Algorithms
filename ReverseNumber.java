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
public class ReverseNumber {
    public int BBreverse(int x) {
        String reversed="0";
        
        if(x<0){
            reversed = "-";
            x = Math.abs(x);
        }
        while(x>9){
            reversed = reversed + x % 10;
            x = x / 10;

        }
        reversed = reversed+x;
        try{
            return Integer.parseInt(reversed);
        }
        catch(NumberFormatException nfe){
            return 0;
        }
        
    }
    
    /*public int BBBreverse(int x) {  //bi ara vbakıcam
        char[] numbers = Integer.toString(x).toCharArray();
        if(numbers.length>9 && numbers[numbers.length-1]>2){
            return 0;
        }
        
        for(int i = 0; i<numbers.length;i++){
            
        }
        return 0 ;
    }*/
}
