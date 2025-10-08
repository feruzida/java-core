package lessons.lesson05.educationCentre;

public abstract class Person {
    private String name;
    private int id;
    private String email;

    public Person(String name, int id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
    }

    public String getInfo() {
        return "Name: " + name + "\nID: " + id + "\nEmail: " + email;
    }

    public void introduce() {
        System.out.println("Hello. My name is " + name);
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}

