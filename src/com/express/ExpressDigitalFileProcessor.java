package com.express;

import com.express.VO.AccountNumber;
import com.express.VO.Digit;
import com.express.constants.DigitConstants;
import com.express.utils.ExpressFileUtils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This class reads the file at a location and parses the digits in the file. This class prints all the digits in the
 * file as a map with key being the digit number and value being validity flag as per the checksum.
 */
public class ExpressDigitalFileProcessor {

    public static void main(String [] args){
        String fileLocation = "C:\\test\\test.txt";
        if(args!=null && args.length>0){
            fileLocation = args[0];
        }
        BufferedReader br = null;
        //initialize
        int digitSize = 3;
        int rowOneIndex =-4,rowTwoIndex = -3,rowThreeIndex = -2;
        int skipRow = -1;
        int lineCounter = -1;
        List<AccountNumber> accountNumbers = new ArrayList<AccountNumber>();
        Map<String,Boolean> actualAccountNumbers = new HashMap<String,Boolean>();
        AccountNumber accountNumber = null;
        try {
            String sCurrentLine = null;
            br = new BufferedReader(new FileReader(fileLocation));
            List<Digit> digits = new ArrayList<Digit>();
            do{
                if(lineCounter != skipRow){
                    List splitSequence = ExpressFileUtils.splitStringIntoGroups(sCurrentLine,digitSize);
                    if(splitSequence !=null && splitSequence.size()>0){
                        int digitCounter = 0;
                            for(Object charObject:splitSequence){
                                char[] charArray = (char []) charObject;
                                if(lineCounter == rowOneIndex){
                                    digits.get(digitCounter).setRow1(charArray);
                                }
                                if(lineCounter == rowTwoIndex){
                                    digits.get(digitCounter).setRow2(charArray);
                                }
                                if(lineCounter == rowThreeIndex){
                                    digits.get(digitCounter).setRow3(charArray);
                                }
                                digitCounter = digitCounter+1;
                            }
                        if(accountNumber!=null){
                            accountNumber.setDigits(digits);
                        }
                    }
                }else{
                    if(accountNumber!=null){
                        accountNumbers.add(accountNumber);
                    }
                    accountNumber = new AccountNumber();
                    digits = ExpressFileUtils.createDigits(DigitConstants.ACCOUNT_SIZE);
                    rowOneIndex = rowOneIndex+4;
                    rowTwoIndex = rowTwoIndex+4;
                    rowThreeIndex = rowThreeIndex+4;
                    skipRow = skipRow+4;
                }

                lineCounter = lineCounter+1;
            }
            while ((sCurrentLine = br.readLine()) != null);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)br.close();
                //This is for final account number
                if(accountNumber!=null){
                    accountNumbers.add(accountNumber);
                }
                //parse the digital account numbers to numeric
                System.out.println("No: of Account Numbers in the file" + accountNumbers.size());
                actualAccountNumbers = ExpressFileUtils.parseAccountNumbers(accountNumbers);
                System.out.println("Account Number and Validity Flag");
                System.out.println(actualAccountNumbers.toString());
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }


    }
}
