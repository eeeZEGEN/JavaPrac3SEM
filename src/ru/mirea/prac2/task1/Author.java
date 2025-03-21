package ru.mirea.prac2.task1;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender){
        this.email = email;
        this.gender = gender;
        this.name = name;
    }

    public String getName() { return name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public void setName(String name) {this.name = name; }
    public char getGender() { return gender; }

    @Override
    public String toString() {
        return "Author\n" +
                "name: " + name +
                "\nemail: " + email +
                "\ngender: " + gender;
    }
}
