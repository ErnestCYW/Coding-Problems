import java.util.*;

class Quadrant {

    public static void main(String[] args) {
        
        Scanner io = new Scanner(System.in);
        int x = io.nextInt();
        int y = io.nextInt();

        if (x > 0 && y > 0) {
            System.out.println(1);
        } else if (x < 0 && y > 0) {
            System.out.println(2);
        } else if (x < 0 && y < 0) {
            System.out.println(3);
        } else if (x > 0 && y < 0) {
            System.out.println(4);
        } 


        io.close();

    }

}