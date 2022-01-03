//Student Name: Chan Yew Whye Ernest
//Student ID: A0214560N

import java.util.*;

public class Researcher implements Comparable<Researcher> {

    int arriveTime;
    int stayTime;

    public Researcher(int arriveTime, int stayTime) {
        this.arriveTime = arriveTime;
        this.stayTime = stayTime;
    }

    @Override
    public int compareTo(Researcher rs) {
        return arriveTime - rs.arriveTime;
    }

}