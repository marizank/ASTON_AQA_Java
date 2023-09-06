package Lesson4;

public class Park {

    String name;
    String workTime;
    String cost;
    Park(String name2, String workTime2, String cost2) {
        name = name2;
        workTime = workTime2;
        cost = cost2;
    }

        void printInfo() {
        System.out.println("name:" + name + " " + "work time:" + workTime + " " + "cost:" + cost);
    }
}

    class AttractionPark {
        public static void main(String[] args) {
            Park attraction1 = new Park("train", "10.00-18.00", "5rub");
            attraction1.printInfo();
            Park attraction2 = new Park("ferris wheel", "10.00-21.00", "10rub");
            attraction2.printInfo();
            Park attraction3 = new Park("aircraft", "10.00-21.00", "7rub");
            attraction3.printInfo();
        }
}
