//Author class to store author's information
public class Author {
    private String name;
    private String email;
    private String gender;
//Three argument constructor
    public Author(String name, String email, String gender){
        setName(name);
        setEmail(email);
        setGender(gender);

    }

    //getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    //Method to store and return the string containing author's information
    public String toString(){
        return "\nAuthor's Name: "+getName()+"\nAuthor's email: "+getEmail()+
        "\nAuthor's gender: "+getGender();
    }
}
