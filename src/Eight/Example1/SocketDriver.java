/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eight.Example1;

/**
 *
 * @author Jahna Sri Aneela Ankam
 */
public class SocketDriver {
    private int ports;

    public SocketDriver(int ports) {
        this.ports = ports;
    }
    
    public int checkPortCount(){
        if(this.ports>5){
            throw new IllegalArgumentException("Number of ports cannot be greater than 5");
            
        }
        else
            return 420;
    }
    public static void main(String[] args){
        System.out.println("Answer for question8example1: Jahna Sri Aneela Anakm");
        SocketDriver s= new SocketDriver(5);
        System.out.println(s.checkPortCount());
        SocketDriver s1= new SocketDriver(8);
        System.out.println(s1.checkPortCount());
    }
}
