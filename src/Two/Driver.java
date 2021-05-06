/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Two;
import java.util.*;
/**
 *
 * @author Jahna Sri Aneela Ankam
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GeometricObject[] array= new GeometricObject[5];
        Square obj1= new Square(true, 3.4, "Square1", 4);
        GeometricObject obj2= new Square(false, 3.8,"square2",4);
        GeometricObject obj3= new Square(true, 3.9,"square2",4);
        GeometricObject obj4= new Square(false, 4.2,"square2",4);
        GeometricObject obj5= new Square(true, 4.5,"square2",4);
        System.out.println("Answer for question2: Jahna Sri Aneela Ankam");
        array[0] = obj5;
        array[1] = obj4;
        array[2] = obj3;
        array[3] = obj2;
        array[4] = obj1;

        for (GeometricObject g : array) {
            Square s1 = (Square) (g);
            if (s1.isColor()) {
                s1.howToColor();
                System.out.println("The Area of " + s1.getObjectName() + " is " + Math.round(s1.calcArea() * 100) / 100.0);
            } else {
                System.out.println(g);

            }
        }

    


        
    }
    
}
