/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ten.example3;
import java.util.*;
/**
 *
 * @author Jahna Sri Aneela Ankam
 */
public class Search {
    static int searchList(List<Integer> li, int number, int small, int large){
        int mid=(large+small)/2;
        if(number==li.get(mid)){
            return mid;
        }
        if(large<small)
            return -1;
        if(number<li.get(mid))
            return searchList(li, number, small, mid - 1);
        return -1;
    }
    public static void main(String [] args){
        ArrayList<Integer> search = new ArrayList<>();
        search.add(10);
        search.add(6);
        search.add(7);
        search.add(78);
        search.add(83);
        search.add(55);
        search.add(25);
        System.out.println("Answer for question 10 example: Jahna Sri Aneela Ankam");
        Scanner s= new Scanner(System.in);
        search.forEach(i -> {
            System.out.print(i + " ");
        });
        System.out.println("");
        System.out.println("Enter the search element from the given list: ");
        int n= s.nextInt();
        Collections.sort(search);
        int element = searchList(search, n, 0, search.size() - 1);
        if (element != -1) {
            System.out.println("Element found in the list");
        } else {
            System.out.println("Element not found");
        }
    }
}

