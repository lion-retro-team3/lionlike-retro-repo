package day08.Exam;

public class ICanDrawTest {
    public static void main(String[] args) {
        ICanDraw CIRCLE = new ICanDraw(TheShapes.CIRCLE, "빨간색", 10);
        ICanDraw SQUARE = new ICanDraw(TheShapes.SQUARE, "주황색", 4);
        ICanDraw TRIANGLE = new ICanDraw(TheShapes.TRIANGLE, "파랑색", 3);

        CIRCLE.draw();
        System.out.println("넓이: " + CIRCLE.getArea());
        System.out.println("둘레: " + CIRCLE.getPerimeter());
        System.out.println();

        SQUARE.draw();
        System.out.println("넓이: " + SQUARE.getArea());
        System.out.println("둘레: " + SQUARE.getPerimeter());
        System.out.println();

        TRIANGLE.draw();
        System.out.println("넓이: " + TRIANGLE.getArea());
        System.out.println("둘레: " + TRIANGLE.getPerimeter());
    }
}
