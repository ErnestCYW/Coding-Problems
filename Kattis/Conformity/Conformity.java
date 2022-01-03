import java.util.*;

public class Conformity {

    public static void main(String[] args) {

        Kattio io = new Kattio(System.in,System.out);
        int numberFrosh = io.getInt();
        HashMap<Integer,Integer> map = new HashMap<>();

        while (numberFrosh--  >0) {

            int[] tempArray = new int[5];

            for (int count = 0; count < 5; count++) {
                tempArray[count] = io.getInt();
            }

            Arrays.sort(tempArray);

            int tempSum = 0;
            for (int i : tempArray) {
                tempSum = tempSum*31 + i; 
            }

            if (map.containsKey(tempSum)){
                map.put(tempSum,map.get(tempSum) + 1);
            } else {
                map.put(tempSum,1);
            }

        }

        int max = Collections.max(map.values());
        int numStudents = 0;

        for (Map.Entry<Integer,Integer> entry: map.entrySet()) {
            if (entry.getValue().equals(max)) {
                numStudents += entry.getValue();
            }
        }

        System.out.println(numStudents);

        io.close();

    }
    
}