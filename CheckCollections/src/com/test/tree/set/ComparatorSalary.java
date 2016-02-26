package com.test.tree.set;

import java.util.Comparator;

public class ComparatorSalary implements Comparator<User>{
    
    @Override
    public int compare(User user1, User user2) {
       return ((Integer)user1.getmSalary()).compareTo(user2.getmSalary());
    }

}
