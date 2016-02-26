package com.test.tree.set;

public class User implements Comparable<User>{
    private String mFirstName;
    private String mLastName;
    private int mSalary;
    
    public User(String firstName, String lastName, int salary) {
        mFirstName = firstName;
        mLastName = lastName;
        mSalary = salary;        
    }

    public String getmFirstName() {
        return mFirstName;
    }

    public String getmLastName() {
        return mLastName;
    }

    public int getmSalary() {
        return mSalary;
    }

    public void setmFirstName(String mFirstName) {
        this.mFirstName = mFirstName;
    }

    public void setmLastName(String mLastName) {
        this.mLastName = mLastName;
    }

    public void setmSalary(int mSalary) {
        this.mSalary = mSalary;
    }

    @Override
    public int compareTo(User obj) {
        return this.mFirstName.compareTo(obj.mFirstName);
    }

    @Override
    public String toString() {
        return this.mFirstName +", " +this.mLastName + ", " + this.mSalary;
    }
}
