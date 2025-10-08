package lessons.lesson03.basicClasses;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void introduce() {
        System.out.println("Hello! My name is " + name + " and I am " + age + " years old.");
    }
}
