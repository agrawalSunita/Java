package com.test.tree.set;

import java.util.Comparator;

public class ComparatorLastName implements Comparator<User>{
    
    @Override
    public int compare(User user1, User user2) {
        return (user1.getmLastName()).compareTo(user2.getmLastName());
    }

}
