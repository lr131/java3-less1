package task3;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> array;


    public double getWeight(int count, double weightOne) {
        return 0.0;
    }

    public boolean compare(Box<T> boxOther) {
        return this.getWeight() == boxOther.getWeight()
    }
}
