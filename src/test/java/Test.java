public class Test
{
    public static int getValue() {
        System.out.println("1");
        try {
            return 0;
        } finally {
            return 1;
        }
    }
    public static void main(String[] args) {
        System.out.println(0);
        System.out.println("return value of getValue(): " + getValue());
    }
}