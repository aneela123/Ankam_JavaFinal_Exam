/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tweleve;
import java.util.*;
/**
 *
 * @author Jahna Sri Aneela Ankam
 */
public class EmployeeDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question12: Jahna Sri Aneela Ankam");
        ArrayList<Employee> e = new ArrayList<>();
        Employee e1 = new Employee(221, "Cindy", 233456);
        Employee e2 = new Employee(322, "George", 200000);
        Employee e3 = new Employee(987, "Lucy", 12303);
        Employee e4 = new Employee(12, "Annie", 133333);
        Employee e5 = new Employee(333, "Andy", 178907);
        
        e.add(e1);
        e.add(e2);
        e.add(e3);
        e.add(e4);
        e.add(e5);
        
        System.out.println("Original List: ");
        printList(e);
        Collections.sort(e);
        System.out.println("Sorting By EmployeeId: ");
        printList(e);
        System.out.println("Sorting By Employee Salary: ");
        Collections.sort(e, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return Double.compare(e1.getEmpSalary(), e2.getEmpSalary());
            }

        });
        printList(e);
        System.out.println("--------Sorting By Name-----------");
        Collections.sort(e, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.getEmpName().compareTo(e2.getEmpName());
            }

        });
        printList(e);

    }

    public static void printList(List<Employee> l) {
        l.forEach(emp -> {
            System.out.println(emp);
        });
    }

}

    
    

