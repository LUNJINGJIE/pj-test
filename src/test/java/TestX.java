import org.junit.Test;

public class TestX {
    @Test
    public void testXxX() {
        int[] unsortedArray = new int[]{6, 5, 4, 3, 5, 6, 9, 1};
        bubbleSort(unsortedArray);
        System.out.println("After sorted: ");
        for (int number : unsortedArray) {
            System.out.println(" " + number);
        }

    }

    private static void bubbleSort(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }
        int length = array.length;
        for (int i = 0; i < length; i++) {
            for (int j = 1; j < length - 1; j++) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
