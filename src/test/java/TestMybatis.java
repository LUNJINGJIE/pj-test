import com.ssm.dao.IUserDao;
import com.ssm.entity.User;
import com.ssm.entity.person;
import com.ssm.mybatis.test.dao.MyBatisTestMapper;
import javafx.scene.input.KeyEvent;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.util.*;

// mybatis进行crud操作需要commit提交事务，除select操作
public class TestMybatis {
    private static SqlSessionFactory sessionFactory;

    static {
        String resource = "test/mybatis.xml";
        try {
            Reader reader = Resources.getResourceAsReader(resource);
            sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
    @Test
    public void testInit() {
        SqlSession sqlSession = sessionFactory.openSession();
        MyBatisTestMapper dao = sqlSession.getMapper(MyBatisTestMapper.class);
        person user1 = new person("user1","男","1234");
        person user2 = new person("user2","男","1234");
        person user3 = new person("user3","男","1234");
        List<person> list = new ArrayList<person>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        dao.insertPersonList(list);
        sqlSession.commit();
        sqlSession.close();
    }
}
