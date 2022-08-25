public class PersonCreator {
    public static void main(String[] args) {
        Person person1=new Person("James Peterson", 34, 180, 73.5 );
        Person person2=new Person("Bob Thornely", 25, 171, 68.2);
        person1.display();
        person2.display();
        person1.growOlder();
        person1.display();
    }
}
