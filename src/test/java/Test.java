public class Test {
    public static void main(String[] args) {
        int i = 0;
        i=i++;
        System.out.println(i);
    }

    public static int getValue() {
        int i = 1;
        try {
            i = 4;
        } finally {
            i++;
            return i;
        }
    }
}