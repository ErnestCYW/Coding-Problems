import java.util.*;

public class SortByFirstTwoLetters implements Comparator<String> {

    /*
    public boolean isCapital(int value) {
        if ((value >= 65) && (value <= 90)) {
            return true;
        } else {
            return false;
        }
    }
    */

    @Override
    public int compare(String name1, String name2) {
        char[] name1array = name1.toCharArray();
        char[] name2array = name2.toCharArray();
        int intValueFirst1 = (int) name1.charAt(0);
        int intValueSecond1 = (int) name1.charAt(1);
        int intValueFirst2 = (int) name2.charAt(0);
        int intValueSecond2 = (int) name2.charAt(1);
        
        /*
        //if first letter 1st string is capital and other is not capital: no swap
        //if first letter 2nd string is capital and other is not capital: swap
        //if both not same
        //else move on to compare 2nd letter
        //if second letter 1st string is capiotal and other is not capital
        //if second letter 2nd string is capital and other is not capital
        //if both not same

        if (isCapital(intValueFirst1) && !isCapital(intValueFirst2)) {
            return -1;
        } else if (isCapital(intValueFirst2) && !isCapital(intValueFirst1)) {
            return 1;
        } else if (intValueFirst1 != intValueFirst2) {
            return intValueFirst1 - intValueFirst2;
        } else {
            if (isCapital(intValueSecond1) && !isCapital(intValueSecond2)) {
                return -1;
            } else if (isCapital(intValueSecond2) && !isCapital(intValueSecond1)) {
                return 1;
            } else {
                return intValueSecond1 - intValueSecond2;
            }
        }
        positive is swap
        negative is no swap
        */

        /*if (isCapital(intValueFirst1) && !isCapital(intValueFirst2)) {
            return -1;
        } else if (!isCapital(intValueFirst1) && isCapital(intValueFirst2)) {
            return 1;
        } else if (intValueFirst1 != intValueFirst2) {
            return intValueFirst1 - intValueFirst2;
        } else if (isCapital(intValueSecond1) && !isCapital(intValueSecond2)) {
            return -1;
        } else if (!isCapital(intValueSecond1) && isCapital(intValueSecond2)) {
            return 1;
        } else {
            return intValueSecond1 - intValueSecond2;
        }*/

        if (intValueFirst1 != intValueFirst2) {
            // System.out.println("comparing first char of " + name1 + " and "+ name2);
            // System.out.println(intValueFirst1 + " - " + intValueFirst2);
            // System.out.println(intValueFirst1 - intValueFirst2);
            return intValueFirst1 - intValueFirst2;
        }
        else {
            // System.out.println("comparing second char of " + name1 + " and "+ name2);
            // System.out.println(intValueFirst1 + " - " + intValueFirst2);
            // System.out.println(intValueSecond1 - intValueSecond2);
            return intValueSecond1-intValueSecond2;
        }


    }

}