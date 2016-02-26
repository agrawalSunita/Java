package com.test.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {
    private static Set<String> set;
    public static void main(String[] args) {
        //basicOp();    
        //otherOp();
        findDups(new String[]{"i", "saw", "i", "came", "left"});
    }
    
    private static void findDups(String[] strArr) {
        Set<String> setStr = new HashSet<String>();
        for(String str : strArr) {
            setStr.add(str);
        }
        System.out.println(setStr);
        
        Set<String> unique = new HashSet<String>();
        Set<String> dup = new HashSet<String>();
        for(String s : strArr) {
            if(!unique.add(s)) {
                dup.add(s);
            }
        }
        unique.removeAll(dup);
        System.out.println("unique ones = " +unique);
        System.out.println("dup ones = " +dup);
    }
    
    private static void otherOp() {
        Set<Integer> a = new HashSet<Integer>(Arrays.asList(new Integer[] {1, 3, 2, 4, 8, 9, 0}));
        Set<Integer> b = new HashSet<Integer>(Arrays.asList(new Integer[] {1, 3, 7, 5, 4, 0, 7, 5}));
        
        //To find Unioin
        Set<Integer> union = new HashSet<Integer>(a);
        union.addAll(b);
        System.out.println("union");
        System.out.println(union);
        
        Set<Integer> intersection = new HashSet<Integer>(a);
        intersection.retainAll(b);
        System.out.println("intersection");
        System.out.println(intersection);
        
        
        Set<Integer> difference = new HashSet<Integer>(a);
        difference.removeAll(b);
        System.out.println("difference");
        System.out.println(difference);
        
    } 
    
    private static void basicOp() {
        set = new HashSet<String>();
        set.add("apple");
        set.add("hello");
        set.add("sam");
        set.add("hello");
        set.add("example");
        set.add("for");
        System.out.println("output without duplicates");
        System.out.println(set);
        
        Set<String> treeSet = new TreeSet<String>(set);
        System.out.println("output in treeset");
        System.out.println(treeSet);
        
    }

}
