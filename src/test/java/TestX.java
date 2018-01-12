import org.junit.Test;

import javax.xml.transform.Source;
import java.util.*;

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

    /**
     * 测试集合
     */
    @Test
    public void testIterator() {
        Map map = new HashMap();
        map.put("test1", "value1");
        map.put("test4", "value2");
        map.put("test1", "value3");
        Set entryset = map.entrySet();
        Iterator it = entryset.iterator();
        while (it.hasNext()) {
            Map.Entry me = (Map.Entry) it.next();
            Object key = me.getKey();
            Object value = me.getValue();
            System.out.println(key + ":" + value);
        }
    }

    /**
     * 测试Collections.sort();
     */
    @Test
    public void testSort() {
        List aList = new ArrayList();
        aList.add("abc");
        aList.add("agcs");
        aList.add("ss");
        aList.add("afss");
        Collections.sort(aList, new Comparator<String>() {
            public int compare(String o1, String o2) {
                int tmp = o1.length() - o2.length();
                return tmp == 0 ? o1.compareTo(o2) : tmp;
            }
        });
        for (Object a : aList) {
            System.out.println(a);
        }
    }
}
