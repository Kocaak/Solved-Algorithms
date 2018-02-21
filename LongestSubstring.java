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
public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        List<Character> mainSubstring = new ArrayList<>();
        List<Character> testSubstring = new ArrayList<>();
        
        if(s.equals("")){
            return 0;
        }
        char parts[] = s.toCharArray();
        
        for(int i=0;i<parts.length;i++){
            
            if(!testSubstring.contains(parts[i])){
                testSubstring.add(parts[i]);
            }
            else{
                if(mainSubstring.size() < testSubstring.size()){
                    mainSubstring.clear();
                    mainSubstring.addAll(testSubstring);
                    while(testSubstring.contains(parts[i])){
                        testSubstring.remove(0);
                    }
                    testSubstring.add(parts[i]);
                }
                else{
                    while (testSubstring.contains(parts[i])) {
                        testSubstring.remove(0);
                    }
                    testSubstring.add(parts[i]);
                }

            }
            
        }
        if(testSubstring.size()>mainSubstring.size()){
            return testSubstring.size();
        }
        return mainSubstring.size();
    }
}
