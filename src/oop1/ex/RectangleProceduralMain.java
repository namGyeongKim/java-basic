package oop1.ex;

public class RectangleProceduralMain {
    public static void main(String[] args) {
        int width = 5;
        int height = 8;
        Rectangle rectangle = new Rectangle();

        int area = rectangle.calculateArea(width, height);
        System.out.println("넓이: " + area);

        int perimeter = rectangle.calculatePerimeter(width, height);
        System.out.println("둘레 길이: " + perimeter);

        boolean square = rectangle.isSquare(width, height);
        System.out.println("정사각형 여부: " + square);
    }
}
