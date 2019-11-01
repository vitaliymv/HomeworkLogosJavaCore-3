package JavaCore_3;

public class Human {
    private int age;
    private String sex;
    private String name;
    private String lastName;

    public Human(int age, String sex, String name, String lastName) {
        this.age = age;
        this.sex = sex;
        this.name = name;
        this.lastName = lastName;
    }

    public Human(int age) {
        this.age = age;
    }

    public Human() { }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
