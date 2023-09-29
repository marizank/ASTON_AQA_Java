package Lesson10;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Box<B extends Fruit> {
    public List<B> getList() {
        return list;
    }
    private List<B> list;
    public Box(B... obj) {
        list = Arrays.asList(obj);
    }
    public Box() {
        list = new ArrayList<B>();
    }
    void add(B obj) {
        list.add(obj);
    }
    void moveAt(Box<B> box) {
        box.getList().addAll(list);
        list.clear();
    }
    void info() {
        if (list.isEmpty()) {
            System.out.println("The box is empty ");
        } else {
            System.out.println("in the box are " + list.get(0).toString() + " in quantity " + list.size());
        }
    }
    float getWeight() {
        if (list.isEmpty()) {
            return 0;
        } else {
            return list.size() * list.get(0).getWeight();
        }
    }
    boolean compare(Box<? extends Fruit> box) {
        return this.getWeight() == box.getWeight();
    }
}