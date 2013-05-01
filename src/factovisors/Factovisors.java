/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package factovisors;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author nick
 */
public class Factovisors {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean stop = false;
        //my cheap iterator
        int it = 0;
        LinkedList<Integer> list = new LinkedList<Integer>();
        while(stop == false){
            try{    
       BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
       String inputLine = inputReader.readLine();
       if(inputLine.length() != 0){
       
       String [] numbers = inputLine.split(" ");
       list.add(Integer.parseInt(numbers[0]));
       list.add(Integer.parseInt(numbers[1]));
       int factorial_me = list.get(it * 2);
       int use_me_to_divide = list.get((it * 2) + 1);
       int divisiblefact = fact(factorial_me);
       //System.out.println(factorial_me);
       //System.out.println(use_me_to_divide);
       //System.out.println(divisiblefact);
       it++;
       }
       else{
           stop = true;
       }
       
      }catch (IOException ioe){
          ioe.printStackTrace();
      }catch (NumberFormatException num){
          System.exit(0);
      }
    }
        //we stopped so now we deliver the results:
        for(int i = 0; i < list.size(); i++){
            try{
            //we take each two items in the list and compute
            int internal_factorial_me = list.get(i * 2);
            int internal_use_me_to_divide = list.get((i * 2) + 1);
            int internalDivisFact = fact(internal_factorial_me);
            if(internalDivisFact % internal_use_me_to_divide == 0){
                System.out.println(internal_use_me_to_divide + " divides " + internal_factorial_me +"!");
            }else{
                System.out.println(internal_use_me_to_divide + " does not divide " + internal_factorial_me + "!");
            }
            }catch (IndexOutOfBoundsException indexout){
                //cheat
              System.exit(0);  
            }
        }
}
        static int fact(int n) {
	
	// Base Case: 
	//    If n <= 1 then n! = 1.
	if (n <= 1) {
	    return 1;
	}
	// Recursive Case:  
	//    If n > 1 then n! = n * (n-1)!
	else {
	    return n * fact(n-1);
	}
    }
}
