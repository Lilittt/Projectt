package Property;

public class Human {
    private String name;
    private String surname;
    private int age = 18;

    @Override
    public String toString() {
        return  name + "," + surname + "," + age;
    }

    public Human(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        if (age >= 18)
            this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 18)
            this.age = age;
    }
}
