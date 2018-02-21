/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package happynumber;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class HappyNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sayi = sc.nextInt();
        boolean sonuc=isHappy(sayi);
        System.out.println(sonuc);
    }
    
    public static boolean isHappy(int n) {
        int result;
        List<Integer> list = new ArrayList<>();
        list.add(n);
        while (n!=1) {
            result = 0;
            while (n!=0) {
                result = (int) (result + (n%10)*(n%10));
                n=n/10;
            }
            if(list.contains(result)){
                return false;
            }
            list.add(result);
            n = result;
        }
        return true;
    }
    
}
