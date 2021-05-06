/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package One.interfacesexample1;

import One.interfacesexample1.Human;

/**
 *
 * @author Jahna Sri Aneela Ankam
 */
public class Person implements Human {
    private int age;

    public Person(int age) {
        this.age = age;
    }
    
    
    @Override
    public String speak() {
            
            if(age>2){
            return ("The child can speak");
            }
            else{
            return("The child cannot speak");                    
            }
    }

    @Override
    public String toString() {
        return "Person" + " age=" + age ;
    }
    
}
class Driver{
    public static void main(String[] args){
        Person p=new Person(1);
        System.out.println("Answer for question1 example1: Jahna Sri Aneela Ankam");
        System.out.println(p);
        System.out.println(p.speak());
    }
}