public class Book {
    //private data members
    private String name;
    private Author author;
    private double price;
    private int qty;

    //constructor
    public Book(String name, Author author, double price){
        this.name=name;
        this.author=author;
        setPrice(price);
    }
    public Book(String name, Author author, double price, int qty){
        this.name=name;
        this.author=author;
        setPrice(price);
        setQty(qty);
    }
    //getters

    public String getName() {
        return name;
    }

    public Author getAuthor() {

        return this.author;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }
    //setters
    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    //functions
    public String toString(){
        author=getAuthor();
        return "Book: "+getName()+author.toString()+"\nPrice: "+getPrice()+
                "\nQuantity: "+getQty();
    }
}
