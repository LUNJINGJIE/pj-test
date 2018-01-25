public class Children extends Parent {
    public Children(int age) {
        super(age);
    }

    public void say() {
        System.out.println("hello world" + age);
    }

    @Override
    public String toString() {
        return "Children{" +
                super.toString() +
                '}';
    }
}
