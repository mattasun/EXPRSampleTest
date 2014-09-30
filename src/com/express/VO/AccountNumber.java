package com.express.VO;

import java.util.List;

/**
 * Account number class to hold list of digits. As list of digits constitute one account number.
 */
public class AccountNumber {

    /**
     * getter for digit variable
     * @return
     */
    public List<Digit> getDigits() {
        return digits;
    }

    /**
     * Setter for digit variable
     * @param digits
     */
    public void setDigits(List<Digit> digits) {
        this.digits = digits;
    }

    //variable to hold list of digits.
    private List<Digit> digits;

}
