package com.express.constants;

import com.express.VO.Digit;

/**
 * This class holds the constants. Particularly this class has all the digit constants from zero to nine.
 */
public class DigitConstants {

    /*
    zeroth digit pattern for row 1
     */
    private static char[] zeroRow1 = {' ', '_', ' '};
    /*
    zeroth digit pattern for row 2
     */
    private static char[] zeroRow2 = {'|', ' ', '|'};
    /*
    zeroth digit pattern for row 3
     */
    private static char[] zeroRow3 = {'|','_', '|'};
    /*
    The actual zero digit pattern object
     */
    public static Digit digitZero = new Digit(zeroRow1,zeroRow2,zeroRow3);

    private static char[] oneRow1 = {' ', ' ', ' '};
    private static char[] oneRow2 = {' ', '|', ' '};
    private static char[] oneRow3 = {' ','|', ' '};
    /*
    The actual one number digit pattern object
     */
    public static Digit digitOne = new Digit(oneRow1,oneRow2,oneRow3);

    private static char[] twoRow1 = {' ', '_', ' '};
    private static char[] twoRow2 = {' ', '_', '|'};
    private static char[] twoRow3 = {'|','_', ' '};
    /*
    The actual two number digit pattern object
     */
    public static Digit digitTwo = new Digit(twoRow1,twoRow2,twoRow3);

    private static char[] threeRow1 = {' ', '_', ' '};
    private static char[] threeRow2 = {' ', '_', '|'};
    private static char[] threeRow3 = {' ', '_', '|'};
    /*
    The actual three number digit pattern object
     */
    public static Digit digitThree = new Digit(threeRow1,threeRow2,threeRow3);

    private static char[] fourRow1 = {' ', ' ', ' '};
    private static char[] fourRow2 = {'|', '_', '|'};
    private static char[] fourRow3 = {' ',' ', '|'};
    /*
    The actual four number digit pattern object
     */
    public static Digit digitFour = new Digit(fourRow1,fourRow2,fourRow3);

    private static char[] fiveRow1 = {' ', '_', ' '};
    private static char[] fiveRow2 = {'|', '_', ' '};
    private static char[] fiveRow3 = {' ','_', '|'};
    /*
    The actual five number digit pattern object
     */
    public static Digit digitFive = new Digit(fiveRow1,fiveRow2,fiveRow3);

    private static char[] sixRow1 = {' ', '_', ' '};
    private static char[] sixRow2 = {'|', '_', ' '};
    private static char[] sixRow3 = {'|','_', '|'};
    /*
    The actual six number digit pattern object
     */
    public static Digit digitSix = new Digit(sixRow1,sixRow2,sixRow3);

    private static char[] sevenRow1 = {' ', '_', ' '};
    private static char[] sevenRow2 = {' ', ' ', '|'};
    private static char[] sevenRow3 = {' ',' ', '|'};
    /*
    The actual seven number digit pattern object
     */
    public static Digit digitSeven = new Digit(sevenRow1,sevenRow2,sevenRow3);

    private static char[] eightRow1 = {' ', '_', ' '};
    private static char[] eightRow2 = {'|', '_', '|'};
    private static char[] eightRow3 = {'|','_', '|'};
    /*
    The actual eight number digit pattern object
     */
    public static Digit digitEight = new Digit(eightRow1,eightRow2,eightRow3);

    private static char[] ninthRow1 = {' ', '_', ' '};
    private static char[] ninthRow2 = {'|', '_', '|'};
    private static char[] ninthRow3 = {' ','_', '|'};
    /*
    The actual nine number digit pattern object
     */
    public static Digit digitNine = new Digit(ninthRow1,ninthRow2,ninthRow3);
    /*
    constant to hold modvalue
     */
    public static int modValue = 11;
    /*
    constant which holds account size value
     */
    public static int ACCOUNT_SIZE = 9;
}
