/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Five;

/**
 *
 * @author Jahna Sri Aneela Ankam
 */
public class ComparableCircle extends Circle implements Comparable <ComparableCircle> {
    public ComparableCircle(double r) {
        super(r);
    }

    public double getAreaComparableCircle() {
        return Math.round(super.getAreaOfCircle()*100)/100.0;
    }
    
    @Override
    public int compareTo(ComparableCircle c) {
        return Double.compare(c.getAreaComparableCircle(), this.getAreaComparableCircle());
    }




}
