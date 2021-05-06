/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eight.Example2;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Jahna Sri Aneela Ankam
 */
public class MarkdownTester {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException{
        // TODO code application logic here
        try{
            Scanner s= new Scanner(new File("readme.md"));
            
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        Scanner s1= new Scanner(System.in);
        int commits=s1.nextInt();
        System.out.println(commits/0);
        
    }
    
}
