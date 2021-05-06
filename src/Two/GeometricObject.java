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
public class GeometricObject {
    private String objectName;
    private int numberOfSides;

    public GeometricObject(String objectName, int numberOfSides) {
        this.objectName = objectName;
        this.numberOfSides = numberOfSides;
    }

    public String getObjectName() {
        return objectName;
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }

    @Override
    public String toString() {
         return "The geometric object is " + this.objectName
                + " and "+ this.getObjectName() +" it is not colorable.";

    }
    
    

}
