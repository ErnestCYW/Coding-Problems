//Student Name: Chan Yew Whye Ernest
//Student ID: A0214560N

import java.util.*;

public class Workstations {

    public static void main(String [] args) {

        Kattio io = new Kattio(System.in,System.out);
        int n = io.getInt();
        int m = io.getInt();
        int noNeed = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(0);
        PriorityQueue<Researcher> researchers = new PriorityQueue<>();

        for (int count = 0; count < n; count++) {
            researchers.add(new Researcher(io.getInt(),io.getInt()));
        }

        /*
        for (int count = 0; count < n; count++) {
            Researcher current = researchers.poll();
            int arriveTime = current.arriveTime;
            int stayTime = current.stayTime;
            //io.println(arriveTime);
            //io.println(stayTime);
            int station =  pq.peek();
            if (station == 0) {                        //First researcher
                //io.println("loop 1 " + count);
                pq.poll();
                pq.add(arriveTime + stayTime + m);
            } else if (station > arriveTime) {         //Before Timeout But In Use
                //io.println("loop 2 " + count);
                pq.add(arriveTime + stayTime + m);
            } else if (station + m < arriveTime) {     //After Timeout
                //io.println("loop 3 " + count);
                pq.add(arriveTime + stayTime + m);                
            } else {
                //io.println("loop 4 " + count); 
                pq.poll();
                pq.add(arriveTime + stayTime + m);
                saved++;
            }
        }
        */

        while (!researchers.isEmpty()) {
            boolean unlocked = false;
            Researcher current = researchers.poll();
            int arriveTime = current.arriveTime;
            int stayTime = current.stayTime;
            while (!unlocked && !pq.isEmpty() && pq.peek() - m <= arriveTime) {
                int temp = pq.poll();
                unlocked = (temp >= arriveTime);
            }

            if (unlocked) {
                noNeed++;
            }

            pq.add(arriveTime + stayTime + m);
        
        }

        io.println(noNeed);
        io.close();

    }
}