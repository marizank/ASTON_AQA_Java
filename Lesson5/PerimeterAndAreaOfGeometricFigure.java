package Lesson5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PerimeterAndAreaOfGeometricFigure {

    public static void main(String[] args) {

        List<FigureInterface> figures = new ArrayList<FigureInterface>();
        figures.add(new Circle(7, "black", "yellow"));
        figures.add(new Square(4, 5, "black","green"));
        figures.add(new Triangle(7, 6, 5, "green", "yellow"));


        Collections.sort(figures, new FigureComparator());
        for (FigureInterface f : figures) {
            System.out.println(f.toString());
        }
    }

    interface FigureInterface {
        public float area();

        public float perimeter();
    }

    static class Square implements FigureInterface {

        @Override
        public float area() {
            return a * b;
        }

        @Override
        public float perimeter() {
            return 2 * (a+b);
        }

        @Override
        public String toString() {

            String info = name;
            info += " perimeter:" + perimeter();
            info += " area:" + area();
            info +=" borderColor:" + borderColor;
            info +=" backgroundColor:" + backgroundColor;
            return info;
        }

        public Square(float a, float b, String borderColor, String backgroundColor) {
            this.a = a;
            this.b = b;
            this.borderColor=borderColor;
            this.backgroundColor=backgroundColor;
        }

        private float a;
        private float b;
        private String borderColor;
        private String backgroundColor;

        private final String name = "Square";

    }

    static class Triangle implements FigureInterface {

        @Override
        public float area() {
            float p = perimeter() / 2;
            return (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }

        @Override
        public float perimeter() {
            return a + b + c;
        }

        @Override
        public String toString() {

            String info = name;
            info += " perimeter:" + perimeter();
            info += " area:" + area();
            info +=" borderColor:" + borderColor;
            info +=" backgroundColor:" + backgroundColor;
            return info;
        }

        public Triangle(float a, float b, float c, String borderColor, String backgroundColor) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.borderColor=borderColor;
            this.backgroundColor=backgroundColor;

        }

        private float a, b, c;
        private String borderColor;
        private String backgroundColor;
        private final String name = "Triangle";

    }

    static class Circle implements FigureInterface {

        @Override
        public float area() {
            return (float) (Math.PI * r * r);
        }

        @Override
        public float perimeter() {
            return (float) (2 * Math.PI * r);
        }

        @Override
        public String toString() {

            String info = name;
            info += " perimeter:" + perimeter();
            info += " area:" + area();
            info +=" borderColor:" + borderColor;
            info +=" backgroundColor:" + backgroundColor;
            return info;
        }

        public Circle(float r, String borderColor, String backgroundColor) {
            this.r = r;
            this.borderColor=borderColor;
            this.backgroundColor=backgroundColor;
        }

        private float r;
        private String borderColor;
        private String backgroundColor;
        private final String name = "Circle";

    }

        static class FigureComparator implements Comparator<FigureInterface> {

            @Override
            public int compare(FigureInterface o1, FigureInterface o2) {
                return (int) (o1.area() - o2.area());
        }

    }

}