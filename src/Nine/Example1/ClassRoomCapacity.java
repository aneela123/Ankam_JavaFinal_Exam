/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nine.Example1;

/**
 *
 * @author Jahna Sri Aneela Ankam
 */
public class ClassRoomCapacity {
    
    public int capacityPerClassRoom(int noOfSeats){
        if(noOfSeats>25){
            throw new ArithmeticException("Class capacity is full, please enroll "
                    + "in a new class!");
            
        }
        else
            return 1;
    }
}
class Driver{
    public static void main(String[] args){
        System.out.println("Answer for question9 example1: Jahna Sri Aneela Ankam");
            try{
                ClassRoomCapacity c= new ClassRoomCapacity();
                System.out.println(c.capacityPerClassRoom(3));
                System.out.println(c.capacityPerClassRoom(200));
                
            
            }
            catch(Exception ex){
                System.out.println(ex.getMessage());
            }
    }
}
