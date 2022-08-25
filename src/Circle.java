public class Circle {
    //private data members
    private double radius;
    private String color;

    //Default constructor
    public Circle(){
        setRadius(1.0);
        this.color="Red";
    }
    //One Argument constructor
    public Circle(double r){
        setRadius(r);

    }
   //getters and setters
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
  // Behavioural Method to calculate the area of the circle
    public double getArea(){
        return Math.PI*Math.pow(getRadius(),2);

    }
}
