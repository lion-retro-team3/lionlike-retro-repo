package day08.Exam;


import static day08.Exam.TheShapes.*;

public class ICanDraw implements Drawable, Measurable {
    private TheShapes myShape;
    private String color;
    private double size;

    // 도형의 모양, 색, 사이즈 정하기

    public ICanDraw(TheShapes myShape, String color, double size) {
        this.myShape = myShape;
        this.color = color;
        this.size = size;

        // 원하는 도형의 모양, 색, 사이즈 선언

    }

    @Override
    public void draw() {
        System.out.println(color + " " + myShape.getName() + "을(를) 그립니다.");
    }

    @Override
    public void erase() {
        System.out.println(color + " " + myShape.getName() + "을(를) 지웁니다.");
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double getArea() {
        switch (myShape) {
            case CIRCLE:
                return Math.PI * size * size;
            case SQUARE:
                return size * size;
            case TRIANGLE:
                return (size * size) / 2;

            default:
                return 0;


        }
    }

    @Override
    public double getPerimeter() {
        switch (myShape) {
            case CIRCLE:
                return 2 * Math.PI * size;
            case SQUARE:
                UARE:
                return 4 * size;

            case TRIANGLE:
                return 3 * size;
            default:
                return 0;


        }
    }
}




