public class Person {
    private int age;
    private String name;
    private int height;
    private double weight;

    public Person(String name, int age, int height, double weight){
        setName(name);
        setAge(age);
        setHeight(height);
        setWeight(weight);

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void display(){
        System.out.println("Name: "+getName());
        System.out.println("Age: "+getAge());
        System.out.println("Height: "+getHeight()+"cm");
        System.out.println("Weight: "+getWeight()+"lbs");
    }

    public void growOlder(){
        this.height--;
        this.age++;
        this.weight-=0.5;
    }
}
