import java.util.List;
import java.util.ArrayList;

public class Modulo {

    public static void main(String[] args) {

        Kattio io = new Kattio(System.in,System.out);

        List<Integer> previousResults = new ArrayList<>();

        for (int count = 0; count < 10; count++) {
            int result = (io.getInt()) % 42;
            previousResults.add(result);
        }

        io.println(previousResults.stream().distinct().count());
        io.close();
    }

}