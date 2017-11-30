import com.ssm.entity.User;
import com.ssm.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
public class TestSSM {

    @Resource
    private UserService userService;
    @Test
    public void testSSM(){
        User user = userService.selectUser(1);
        System.out.println(user);
    }
}
