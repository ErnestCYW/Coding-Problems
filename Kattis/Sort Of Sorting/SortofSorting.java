import java.util.*;

public class SortofSorting {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (count >= 0) {
            int numberItems = Integer.parseInt(sc.nextLine());
            if (numberItems == 0) {
                break;
            } else if (count != 0) {
                System.out.println();
            }
            List<String> toSort = new ArrayList<>();
            for (int i = 0; i < numberItems; i++) {
                toSort.add(sc.nextLine());
            }
            Collections.sort(toSort, new SortByFirstTwoLetters());
            //System.out.println(toSort.toString());
            for (String name : toSort) {
                System.out.println(name);
            }
            count++;
        }
    }
}
