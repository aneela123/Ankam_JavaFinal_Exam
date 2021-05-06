/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Seven;
import java.util.*;
/**
 *
 * @author Jahna Sri Aneela Ankam
 */
public class Array {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        Random r= new Random();
        int s=100;
        int[] a= new int[s];
        for(int i=0;i<s;i++){
            a[i]=r.nextInt(100);
        }
        System.out.println("Answer for question 7: Jahna Sri Aneela Ankam");
        System.out.println("Enter the index of the array: ");
        int index= sc.nextInt();
        if(index<0 || index>(s-1)){
            System.out.println("Out of Bounds");
        }
        else{
            System.out.println("value is: "+a[index]);
        }
    }
}
