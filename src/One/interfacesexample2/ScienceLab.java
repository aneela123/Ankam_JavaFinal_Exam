/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package One.interfacesexample2;

import One.interfacesexample2.ScienceExperiment;

/**
 *
 * @author Jahna Sri Aneela Ankam
 */
public class ScienceLab implements ScienceExperiment {
    private int phLevel;

    public ScienceLab(int phLevel) {
        this.phLevel = phLevel;
    }

    @Override
    public String toString() {
        return "ScienceLab" + "\nphLevel=" + phLevel ;
    }
    
    
    @Override
    public String litmusTest() {
        if(phLevel>7){
            return "acid";
        }
        else if(phLevel==7){
            return "neutral";
        }
        else
            return "base";
    }
}


    class DriverMain{
        public static void main(String[] args){
            ScienceLab s= new ScienceLab(5);
            System.out.println("Answer for question1 example2: Jahna Sri Aneela Ankam");
            System.out.println(s);
            System.out.println(s.litmusTest());
        }
    }
    


