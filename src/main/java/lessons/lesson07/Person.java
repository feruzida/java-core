package lessons.lesson07;

public abstract class Person {
    private String fio;
    private int id;

    public Person(String fio, int id) {
        this.fio = fio;
        this.id = id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fio='" + fio + '\'' +
                ", id=" + id +
                '}';
    }
}
