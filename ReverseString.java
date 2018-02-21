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
public class ReverseString {
    
    public String reverseString(String s) {
        char[] stringArray = s.toCharArray();
        int lenght = stringArray.length;
        
        if(lenght%2 == 0){
            for(int i = 0; i<lenght/2;i++){
                char temp =  stringArray[i];
                stringArray[i] = stringArray[lenght-1-i];
                stringArray[lenght-1-i] = temp;
            }
            return new String(stringArray);
        }
        else{
            for (int i = 0; i < (lenght-1) / 2; i++) {
                char temp = stringArray[i];
                stringArray[i] = stringArray[lenght - 1 - i];
                stringArray[lenght - 1 - i] = temp;
            }
            return new String(stringArray);
        }
    }
}
