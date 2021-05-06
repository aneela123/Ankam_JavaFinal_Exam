/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Three.Example2;

/**
 *
 * @author Jahna Sri Aneela Ankam
 */
public class Bag {
    private String bagName;

    public Bag(String bagName) {
        this.bagName = bagName;
    }

    @Override
    public String toString() {
        return "Bag" + "bagName=" + bagName;
    }
}
 class HandBag extends Bag {
    private String material;

    public HandBag(String material, String bagName) {
        super(bagName);
        this.material = material;
    }

    
    @Override
    public String toString() {
        return "HandBag" + "material=" + material ;
    }
    
    
}
class Driver{
    public static void main(String[] args){
        Bag h= new HandBag("Fur","Levis");
        Bag b= h;  //implicit casting
        Bag h1= new Bag("Leather");
        HandBag h2= (HandBag)h;
        System.out.println(b);
        System.out.println(h2);
        
        
    }
}
