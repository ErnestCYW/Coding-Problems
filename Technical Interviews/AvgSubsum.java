//Author: Chan Yew Whye Ernest
//For NUS Fintech Society Blockchain Recruitment 2021

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class AvgSubsum {
    
    public static void main(String[] args) {
        
        //For input output
        Scanner io = new Scanner(System.in);

        //Assume array given as a string in standard input
        //Get array in string representation, convert to array list
        String arrString = io.nextLine();
        List<Integer> givenArr = new ArrayList<>();
        for (String value : arrString.replace("[","").replace("]","").split(",")) {
            givenArr.add(Integer.parseInt(value));
        }

        //Assume array is not empty
        int subsumTotal = 0; //total value of all subsums
        for (int subsumNum = 0; subsumNum < givenArr.size(); subsumNum++) { //iterate through length ie. num subsums
            for (int count = 0; count <= subsumNum; count++) { //iterate until index
                subsumTotal += givenArr.get(count); //add to total value
            }
        }

        double result = subsumTotal/ (double) givenArr.size(); //find average
        System.out.println(result);
    }
}
