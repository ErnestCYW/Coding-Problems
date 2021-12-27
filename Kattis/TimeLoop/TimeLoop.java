import java.util.Scanner;

public class TimeLoop {

    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);

        int n = io.nextInt();

        for (int count = 1; count <= n; count++) {
            System.out.println(count + " Abracadabra");
        }

    }

}