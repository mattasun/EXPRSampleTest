package com.express.constants;

import com.express.VO.Digit;
import com.express.constants.DigitConstants;

/**
 * This class is an enum class which holds the mapping from digit type to actual numeric value. This enum class has list
 * of digits from zero to nine which are digits in account number.
 */
public enum DigitConverter {
    /*
    All the constant digits from zero to nine.
     */
    DigitZero(DigitConstants.digitZero,"0"),DigitOne(DigitConstants.digitOne,"1"),DigitTwo(DigitConstants.digitTwo,"2"),
    DigitThree(DigitConstants.digitThree,"3"),DigitFour(DigitConstants.digitFour,"4"),DigitFive(DigitConstants.digitFive,"5"),
    DigitSix(DigitConstants.digitSix,"6"),DigitSeven(DigitConstants.digitSeven,"7"),DigitEight(DigitConstants.digitEight,"8"),DigitNine(DigitConstants.digitNine,"9");

    /*
    getter for digit type
     */
    public Digit getDigitType() {
        return digitType;
    }

    /*
    setter for digit type
     */
    public void setDigitType(Digit digitType) {
        this.digitType = digitType;
    }

    /*
    variable for digit type
     */
    private Digit digitType;

    /*
    getter for numeric type
     */
    public String getNumericValue() {
        return numericValue;
    }

    /*
    setter for numeric type
     */
    public void setNumericValue(String numericValue) {
        this.numericValue = numericValue;
    }

    /*
    variable to hold numeric equivalent for digit type
     */
    private String numericValue;

    /*
    overloaded constructor
     */
    private DigitConverter(Digit paramName, String numericValue) {
        this.digitType = paramName;
        this.numericValue = numericValue;
    }

}
