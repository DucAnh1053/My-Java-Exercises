package ex2.ex2_9;

import ex2.ex2_6.MyPoint;

public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        v1 = new MyPoint(x1, y1);
        v2 = new MyPoint(x2, y2);
        v3 = new MyPoint(x3, y3);
    }

    @Override
    public String toString() {
        return "MyTriangle{" + "v1=" + v1 + ", v2=" + v2 + ", v3=" + v3 + '}';
    }

    public double getPerimeter() {
        return v1.distance(v2) + v2.distance(v3) + v3.distance(v1);
    }

    public String getType() {
        double d1 = v1.distance(v2);
        double d2 = v2.distance(v3);
        double d3 = v3.distance(v1);
        if (d1 == d2 && d2 == d3 && d3 == d1) {
            return "Equilateral";
        }
        if ((d1 == d2 & d2 != d3) || (d2 == d3 && d3 != d1) || (d3 == d1 && d1 != d2)) {
            return "Isosceles";
        }
        return "Scalene";
    }
}
