package lecture05;

import java.util.ArrayList;
import java.util.List;

public class Exercise5_7 {
    public static void main(String[] args) {
        Butterfly butterfly = new Butterfly();
        Locust locust = new Locust();
        SwallowtailButterfly swallowtailButterfly = new SwallowtailButterfly();

        Insect[] list = new Insect[3];

        list[0] = butterfly;
        list[1] = locust;
        list[2] = swallowtailButterfly;

        for(Insect i : list) {
            i.move();
        }




    }
}
