/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Six.Example1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Jahna Sri Aneela Ankam
 */
public class BankData {
    public static void main(String[] args)throws IOException{
        try{
            Scanner s= new Scanner(new File("bank.txt"));
        }
        catch(FileNotFoundException f){
            System.out.println("Answer for question6 example1: Jahna Sri Aneela Ankam");
            System.out.println(f.getMessage());
        }
    }
}
