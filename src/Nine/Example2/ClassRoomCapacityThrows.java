/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nine.Example2;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Jahna Sri Aneela Ankam
 */
public class ClassRoomCapacityThrows {

    void myClass() throws IOException {
        throw new IOException("My class capacity is full!!");
    }

    public int halfCapacity(int n) throws ArithmeticException {

        int half = n / 2;
        if (half <= 10) {
            throw new ArithmeticException("Half of the capacity should"
                    + " atleast be more than 10");
        }
        return half;
    }
}

class Driver {

    public static void main(String[] args) throws IOException {
        try {
            ClassRoomCapacityThrows c1 = new ClassRoomCapacityThrows();
            System.out.println("Answer for question 9: Jahna Sri Aneela Ankam");
            System.out.println(c1.halfCapacity(400));
            System.out.println(c1.halfCapacity(20));
        }catch(ArithmeticException ae){
            System.out.println(ae.getMessage());
        }
      
            Scanner s=new Scanner(new File("class.txt"));
    }
}
