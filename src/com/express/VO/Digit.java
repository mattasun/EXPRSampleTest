package com.express.VO;

import java.util.Arrays;

/**
 * Digit class to hold the digit patterns. Each digit is a 3 characters arrays of 3 rows. Each row has list of
 * characters.
 */
public class Digit {


    /*
    empty constructor
     */
    public Digit() {

    }
    /*
    getter for row1
     */
    public char[] getRow1() {
        return row1;
    }
    /*
    setter for row1
     */
    public void setRow1(char[] row1) {
        this.row1 = row1;
    }
    /*
    getter for row2
     */
    public char[] getRow2() {
        return row2;
    }
    /*
    setter for row 2
     */
    public void setRow2(char[] row2) {
        this.row2 = row2;
    }
    /*
    getter for row 3
     */
    public char[] getRow3() {
        return row3;
    }
    /*
    setter for row 3
     */
    public void setRow3(char[] row3) {
        this.row3 = row3;
    }

    /**
     * variable to hold row 1 list of characters
     */
    private char[] row1;
    /**
     * variable to hold row 2 list of characters
     */
    private char[] row2;
    /**
     * variable to hold row 3 list of characters
     */
    private char[] row3;

    /**
     * overloaded constructor to create a digit with input args
     * @param row1
     * @param row2
     * @param row3
     */
    public Digit(char[] row1, char[] row2, char[] row3){
        this.row1 = row1;
        this.row2 = row2;
        this.row3 = row3;
    }

    /**
     * overridden equals method to compare digits.
     * @param obj
     * @return
     */
    public boolean equals(Object obj){

        if(obj == null || obj.getClass() != this.getClass()){
            return false;
        }
        Digit digit = (Digit) obj;
        if(Arrays.equals(this.row1, digit.row1) && Arrays.equals(this.row2,digit.row2)
                && Arrays.equals(this.row3,digit.row3)){
            return true;
        }else{
            return false;
        }
    }
}
