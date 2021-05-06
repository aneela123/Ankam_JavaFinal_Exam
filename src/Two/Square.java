/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Two;

/**
 *
 * @author Jahna Sri Aneela Ankam
 */
public class Square extends GeometricObject implements Colorable {
    private boolean color;
    private double len;

    public Square(boolean color, double len, String objectName, int numberOfSides) {
        super(objectName, numberOfSides);
        this.color = color;
        this.len = len;
    }
    
    public boolean isColor() {
        return color;
    }

    public double getLength() {
        return len;
    }

    public double calcArea() {
        return Math.pow(len, 2);
    }

    @Override
    public void howToColor(){
        System.out.println("color of all four sides");
    }
}
