/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Six.Example2;

/**
 *
 * @author Jahna Sri Aneela Ankam
 */
class Mirror {

    private int peopleFit;

    public Mirror(int peopleFit) {
        this.peopleFit = peopleFit;
    }

    public int getNoOfPeople() {
        if (peopleFit > 3) {
            throw new IllegalArgumentException("People cannot be greater than 3!!!");

        } else {
            return peopleFit + 1;
        }
    }
}

public class MirrorImages {

    public static void main(String[] args) {
        try {
            Mirror mirr = new Mirror(5);
            System.out.println("Answer for question6 example2: Jahna Sri Aneela Ankam");
            System.out.println("The number of people can fit is :" + mirr.getNoOfPeople());
        } catch (IllegalArgumentException ie) {
            System.out.println(ie.getMessage());
        }
    }
}
