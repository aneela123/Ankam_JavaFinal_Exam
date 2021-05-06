/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eleven.Example2;

import java.util.Objects;

/**
 *
 * @author Jahna Sri Aneela Ankam
 */
public class Experiments {

    private String type;
    private double cost;

    public Experiments(String type, double cost) {
        this.type = type;
        this.cost = cost;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Experiments{" + "type=" + type + ", cost=" + cost + '}';
    }

    /*
        hashCode method returns a code which is unique to the attribute. So when we want compare the hashcodes if the 
    hashcodes are same then are equal. They reside in the same stack. All the attributes or objects
    residing in the same hashStack will have same hashcodes.
     */

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.type);
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.cost) ^ (Double.doubleToLongBits(this.cost) >>> 32));
        return hash;
    }

    /*
        equals method checks whether content in the 2 objects. If the attributes mentioned in the 
    equals method are equal. Then irrespective of other attributes the objects will be same.
     */
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
        final Experiments other = (Experiments) obj;
        if (Double.doubleToLongBits(this.cost) != Double.doubleToLongBits(other.cost)) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        return true;
    }
}

class Driver {

    public static void main(String[] args) {
        //Creating objects for the Experiments class.
        //we see that ex and ex1 have same type and cost hence all the objects with these
        // same values  are equal. 
        Experiments ex = new Experiments("Natural Experiment", 140.3);
        Experiments ex1 = new Experiments("Natural Experiment", 140.3);
        Experiments ex2 = new Experiments("field experiment", 200.3);

        //The below three statements checks whther the objects equal or not. Except for
        // ex and ex1 all other comparisions are false.
        System.out.println("Answer for question11 example2: Jahna Sri Aneela Ankam");
        System.out.println("***** equals *****");
        System.out.println(ex.equals(ex1));
        System.out.println(ex.equals(ex2));
        System.out.println(ex1.equals(ex2));
// The below 3 lines checks for the hascodes. the hashcodes for ex and ex1 are equals because the 
// valuess are equal.
        System.out.println("***** hashcode *****");
        System.out.println(ex.hashCode());
        System.out.println(ex1.hashCode());
        System.out.println(ex2.hashCode());
    }
}
