package oop1.ex;

public class Rectangle {
    int width;
    int height;

    int calculateArea(int width, int height) {
        return width * height;
    }

    int calculatePerimeter(int width, int height) {
        return (width * 2) + (height * 2);
    }

    boolean isSquare(int width, int height) {
        if (width == height) {
            return true;
        } else {
            return false;
        }
    }
}
