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
public class Circle {
    private double r;
    public static final double PI = Math.PI;

    public Circle(double r) {
        this.r = r;
    }

    public double getAreaOfCircle() {
        return PI * r * r;
    }

}
