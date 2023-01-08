package ex2.ex2_10;

import ex2.ex2_6.MyPoint;

public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

    public MyRectangle(int x1, int y1, int x2, int y2) {
        topLeft = new MyPoint(x1, y1);
        bottomRight = new MyPoint(x2, y2);
    }

    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public int getLength() {
        if (bottomRight.getX() - topLeft.getX() > topLeft.getY() - bottomRight.getY()) {
            return bottomRight.getX() - topLeft.getX();
        }
        return topLeft.getY() - bottomRight.getY();
    }

    public int getWidth() {
        if (bottomRight.getX() - topLeft.getX() < topLeft.getY() - bottomRight.getY()) {
            return bottomRight.getX() - topLeft.getX();
        }
        return topLeft.getY() - bottomRight.getY();
    }

    public double getDiagonal() {
        return topLeft.distance(bottomRight);
    }

    public int getArea() {
        return (bottomRight.getX() - topLeft.getX()) * (topLeft.getY() - bottomRight.getY());
    }

    public int getPerimeter() {
        return 2 * (bottomRight.getX() - topLeft.getX() + topLeft.getY() - bottomRight.getY());
    }

    @Override
    public String toString() {
        return "Rectangle[length = " + getLength() + ", width = " + getWidth() + "]";
    }
}
