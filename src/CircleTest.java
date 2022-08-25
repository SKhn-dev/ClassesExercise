import java.text.DecimalFormat;

public class CircleTest {
    public static void main(String[] args) {
        DecimalFormat df=new DecimalFormat("0.00");
        Circle circle=new Circle();
        System.out.println("Area of the circle: "+df.format(circle.getArea()));
        Circle circle1=new Circle(2.0);
        System.out.println("Area of the circle: "+df.format(circle1.getArea()));
    }
}
