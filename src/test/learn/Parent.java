import java.io.Serializable;

public class Parent implements Serializable {
    int age;

    public Parent(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Parent{" +
                "age=" + age +
                '}';
    }
}
