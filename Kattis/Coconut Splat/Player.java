public class Player {

    public int number;
    public int state;

    //For state:
    //2 Represents Folded
    //1 Represents Fist
    //0 Represents Palm
    public Player(int number, int state) {
        this.number = number;
        this.state = state;
    }

    @Override
    public String toString() {
        return "[" + number + "," + state + "]";
    }
    
}
