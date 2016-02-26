package com.test.tree.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeEgWithComparator {

    private static Set<User> usetlastName;
    private static Set<User> usetSalary;
    
    public static void main(String[] args) {
        usetlastName = new TreeSet<User>(new ComparatorLastName());
        usetSalary = new TreeSet<User>(new ComparatorSalary());
        populateUserset();
        
        printlastName();
        printSalary();
        
        
        
    }
    private static void printlastName() {                
        System.out.println("for each last name");
        for(User u : usetlastName) {
            System.out.print(u.getmLastName() +", ");
        }
        
    }
    
    private static void printSalary() {                
        System.out.println("for each salary");
        for(User u : usetSalary) {
            System.out.print(u.getmSalary() +", ");
        }
        
    }
    
    private static void populateUserset() {
        usetlastName.add(new User("geller","monica", 8000));        
        usetlastName.add(new User("bisht","naren", 3000));
        usetlastName.add(new User("agrawal","sunita", 500));
        
        usetSalary.add(new User("geller","monica", 8000));        
        usetSalary.add(new User("bisht","naren", 3000));
        usetSalary.add(new User("agrawal","sunita", 500));
    }



}
