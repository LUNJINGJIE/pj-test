import org.junit.Test;

import java.io.*;

public class TestSerializable {

    @Test
    public void testSerializable() throws IOException, ClassNotFoundException {
        // 把children对象持久化写入文件
        Children children = new Children(2);
        FileOutputStream outputStream = new FileOutputStream("E:/test.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(children);
        outputStream.close();
        objectOutputStream.close();

        // 把children对象从文件读出
        FileInputStream inputStream = new FileInputStream("E:/test.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        Children c = (Children) objectInputStream.readObject();
        c.say();
        inputStream.close();
        objectInputStream.close();
        System.out.println(c);
    }
}
