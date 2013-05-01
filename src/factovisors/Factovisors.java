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
       
       String [] numbers = inputLine.split(" ");
       list.add(Integer.parseInt(numbers[0]));
       list.add(Integer.parseInt(numbers[1]));
       int divisor = list.get(it * 2);
       int divisible = list.get((it * 2) + 1);
       int divisiblefact = fact(divisible);
       System.out.println(divisor);
       System.out.println(divisible);
       System.out.println(divisiblefact);
       it++;
       if(inputLine != null){
       } else {
                    stop = true;
                }
           
       
      }catch (IOException ioe){
          ioe.printStackTrace();
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
