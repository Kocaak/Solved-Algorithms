/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allleetcodeprojects;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class MakingAnagrams {
    public static int numberNeeded(String first, String second) {
        for (int i=0;i<first.toCharArray().length;i++) {
            if (second.indexOf(first.charAt(i)) >= 0) {
                second = second.substring(0, second.indexOf(first.charAt(i))) + second.substring(second.indexOf(first.charAt(i)) + 1, second.length());
                first = first.substring(0, i) + first.substring(i+1, first.length());
                i--;
            }
        }
        return first.length()+second.length();
    }
    
    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        //String a = in.next();
        //String b = in.next();
        System.out.println(numberNeeded("abc", "cde"));
    }
}
