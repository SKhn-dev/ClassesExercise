public class Library {
    public static void main(String[] args) {

        //Create Author object
        Author author =new Author("Susan Cain", "susain@hotmail.com", "female");
        //Creating book object
        Book book1=new Book("Quiet", author, 10);
        System.out.println(book1.toString());
        Book book2=new Book("Quiet", author, 10, 2);
        System.out.println(book2.toString());
    }
}
