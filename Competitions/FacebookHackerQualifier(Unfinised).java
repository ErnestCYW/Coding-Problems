import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



class Result {

    /*
     * Complete the 'toolchanger' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING_ARRAY tools
     *  2. INTEGER startIndex
     *  3. STRING target
     */

    public static int toolchanger(List<String> tools, int startIndex, String target) {
    // Write your code here
        
        int moves_left = 0;
        int move_left_index = startIndex;
        while (true) {
            if (move_left_index == -1) {
                move_left_index = tools.size()-1;
            }
            if (tools.get(move_left_index) != target) {
                move_left_index--;
                moves_left++;
            } else {
                break;
            }
        }
        
        int moves_right = 0;
        int move_right_index = startIndex;
        while (true) {
            if (move_right_index == tools.size()) {
                move_right_index = 0;
            }
            if (tools.get(move_right_index) != target) {
                move_right_index++;
                moves_right++;
            } else {
                break;
            }
        }
    
        System.out.println(moves_left);
        System.out.println(moves_right);
    
        if (moves_left < moves_right) {
            return moves_left;
        } else {
            return moves_right;
        }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int toolsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> tools = new ArrayList<>();

        for (int i = 0; i < toolsCount; i++) {
            String toolsItem = bufferedReader.readLine();
            tools.add(toolsItem);
        }

        int startIndex = Integer.parseInt(bufferedReader.readLine().trim());

        String target = bufferedReader.readLine();

        int result = Result.toolchanger(tools, startIndex, target);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
