public class Person{

    private String name;
    private int age;
    private char grade;
    private long phone;

    public Person(String name, int age, char grade, long phone) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "[" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                ", phone=" + phone +
                ']';
    }
}
