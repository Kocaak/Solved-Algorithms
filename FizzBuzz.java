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

//for multiples of three it output “Fizz” instead of the number and for the multiples
//of five output “Buzz”. For numbers which are multiples of both three and five output “FizzBuzz”.
public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        int three = 1, five = 1;
        List<String> List = new ArrayList<>();
        
        for(int i = 1; i<=n;i++){
            if(five == 5){
                five = 1;
                if(three == 3){
                    List.add("FizzBuzz");
                    three = 1;
                }
                else{
                    List.add("Buzz");
                    three++;
                }
            }
            else if(three == 3) {
                List.add("Fizz");
                three = 1;
                five++;
            }
            else{
                List.add(String.valueOf(i));
                five++; three++;
            }
        }
        
        return List;
    }
}
