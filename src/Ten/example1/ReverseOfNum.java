/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ten.example1;
import java.util.*;
/**
 *
 * @author Jahna Sri Aneela Ankam
 */
public class ReverseOfNum {
    public static void Reverse(int n){
        if(n<10){
            System.out.println(n);
            return;
        }
        else{
            System.out.print(n%10);
            Reverse(n/10);
        }
    }
    public static void main(String[] args){
        int number=0;
        System.out.println("Answer for Question 10 Example1: Jahna Sri Aneela Ankam");
        System.out.println("Enter a number to be reversed: ");
        Scanner s= new Scanner(System.in);
        number= s.nextInt();
        System.out.print("Reverse of the number "+number+ " is: ");
        Reverse(number);
        
    }
}
