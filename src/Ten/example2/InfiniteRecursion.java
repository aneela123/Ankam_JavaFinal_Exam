/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ten.example2;

/**
 *
 * @author Jahna Sri Aneela Ankam
 */
public class InfiniteRecursion {
    
    
    static void myMethod(){
        System.out.println("This is an example of infinite recursion!");
        myMethod();
    }
    public static void main(String [] args){
        System.out.println("Answer for question10 example2: Jahna Sri Aneela Ankam");
        myMethod();
    }
}
