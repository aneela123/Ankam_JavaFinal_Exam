/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Five;
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
        ComparableCircle c1 = new ComparableCircle(4);
        ComparableCircle c2 = new ComparableCircle(4.5);
        ComparableCircle c3 = new ComparableCircle(9.5);

        ArrayList<ComparableCircle> l = new ArrayList<>();
        l.add(c2);
        l.add(c1);
        l.add(c3);
        System.out.println("Answer for question 5: Jahna Sri Aneela Ankam");
        System.out.println("Before Sorting :");
        printList(l);

        Collections.sort(l);

        System.out.println("After Sorting :  "
                + "The Larger of Three Areas is:  "
                + l.get(0).getAreaComparableCircle());
    }

    public static void printList(List<ComparableCircle> l1) {
        l1.forEach(c -> {
            System.out.println(c.getAreaComparableCircle());
        });
    }

}

    
    

