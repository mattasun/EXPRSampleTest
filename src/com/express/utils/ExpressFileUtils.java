package com.express.utils;

import com.express.VO.AccountNumber;
import com.express.VO.Digit;
import com.express.constants.DigitConstants;
import com.express.constants.DigitConverter;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * This class contains all Utility methods for parsing input file
 */
public class ExpressFileUtils {

    /**
     * This method splits each line in the file into group of three characters
     * as the the group of three characters makes up a digit
     * @param inputString
     * @param groupLength
     * @return
     */
    public static List splitStringIntoGroups(String inputString,int groupLength){

        List groupedChars = new ArrayList();
        if(inputString!=null){
            int inputStringLength = inputString.length();
            if(inputStringLength % groupLength != 0){
                System.out.println("Cannot divide the inputString by given length");
                return groupedChars;
            }else{
                int count = 0;
                for(int index=0;index < inputStringLength/groupLength; index++){
                    String splitString = inputString.substring(count*groupLength, (count + 1) * groupLength);
                    char[] row = splitString.toCharArray();
                    groupedChars.add(row);
                    count = count+1;
                }
            }
        }

        return groupedChars;
    }

    /**
     * This function creates digits and adds them to array list.
     * @param accountNumberSize
     * @return
     */
    public static List<Digit> createDigits(int accountNumberSize) {
        List<Digit> digits = new ArrayList<Digit>();
            for(int index=0;index < accountNumberSize;index++){
                Digit digit = new Digit();
                digits.add(digit);
            }
    return digits;
    }

    /**
     * This is the main method which parses the account numbers into actual strings by leveraging the overridden equals
     * method in Digit object. This method also does the checksum. Finally it puts the parsed account numbers in a map
     * where key is the parsed account number and value is the validity from checksum.
     * @param accountNumbers
     * @return
     */
    public static LinkedHashMap<String,Boolean> parseAccountNumbers(List<AccountNumber> accountNumbers) {
        LinkedHashMap<String,Boolean> actualAcctNumbers = new LinkedHashMap<String, Boolean>();
        for(AccountNumber accountNumber:accountNumbers){
            StringBuilder accountString = new StringBuilder();
            List<Digit> digits = accountNumber.getDigits();
            int checksum = 9;
            int checksumCount = 0;
            boolean isValid = false;
            for(Digit digit:digits){
                for(DigitConverter digitConverter:DigitConverter.values()){
                    Digit toConvertDigit = digitConverter.getDigitType();
                    if(digit.equals(toConvertDigit)){
                        accountString.append(digitConverter.getNumericValue());
                        //do checksum
                        checksumCount = checksumCount + (checksum * Integer.parseInt(digitConverter.getNumericValue()));
                    }
                }
                checksum = checksum - 1;
            }
            if(checksumCount % DigitConstants.modValue == 0){
                isValid = true;
            }
            actualAcctNumbers.put(accountString.toString(), isValid);
        }
        return actualAcctNumbers;
    }
}
