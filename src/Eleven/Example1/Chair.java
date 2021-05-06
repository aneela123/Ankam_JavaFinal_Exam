/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eleven.Example1;

import java.util.Objects;

/**
 *
 * @author Jahna Sri Aneela Ankam
 */
public class Chair {
    private int quantity;
    private String color;
    private String ShowRoom;

    public Chair(int quantity, String color, String ShowRoom) { //constructor with 3 arguments
        this.quantity = quantity;
        this.color = color;
        this.ShowRoom = ShowRoom;
    }
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.quantity;
        hash = 79 * hash + Objects.hashCode(this.color);
        hash = 79 * hash + Objects.hashCode(this.ShowRoom);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Chair other = (Chair) obj;
        if (this.quantity != other.quantity) {
            return false;
        }
        if (!Objects.equals(this.color, other.color)) {
            return false;
        }
        if (!Objects.equals(this.ShowRoom, other.ShowRoom)) {
            return false;
        }
        return true;
    }
}
 class Main{
     public static void main(String [] args){
         Chair chair= new Chair(2,"white","Tesya Furniture");
         Chair chair1= new Chair(2,"Black","Ikea Furniture");
         System.out.println("Answer for question11 example1: Jahna Sri Aneela Ankam");
         if(chair.hashCode()==chair1.hashCode()){
             if(chair.equals(chair1))
                 System.out.println("Both objects are equal!");
             else
                 System.out.println("Both objects are not equal!");
         }
         else
             System.out.println("Both objects are not equal");
        System.out.println(chair.hashCode());
        System.out.println(chair1.hashCode());
     }
 }
