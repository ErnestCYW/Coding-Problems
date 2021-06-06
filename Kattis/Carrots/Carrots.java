public class Carrots{
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in,System.out);
        io.getInt();
        int ans = io.getInt();
        io.println(ans);
        io.close();
    }

}