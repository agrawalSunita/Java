package com.test.tree.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


public class TreeEgWithComparable {
    private static Set<User> userSet;
    
    public static void main(String[] args) {
        userSet = new TreeSet<User>();
        populateUserset();
        
        System.out.println("tostring");
        System.out.println(userSet.toString());
        
        System.out.println("for each");
        for(User u : userSet) {
            System.out.print(u.getmFirstName() +", ");
        }
        System.out.println("iterator");
        Iterator<User> itr = userSet.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
        
    }
    
    private static void populateUserset() {
        userSet.add(new User("geller","monica", 8000));        
        userSet.add(new User("bisht","naren", 3000));
        userSet.add(new User("agrawal","sunita", 500));
    }

}
