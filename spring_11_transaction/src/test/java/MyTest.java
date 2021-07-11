import com.yaozhou.dao.UserMapper;
import com.yaozhou.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by WXHang on HANG at 2021/7/11 16:40
 */
public class MyTest {
    @Test
    public void Spring_Mybatis_Test() throws IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserMapper mapper = context.getBean("userMapper", UserMapper.class);
        User user = new User();
        user.setId(9);
        user.setUserName("尧神");
        mapper.addUser(user);
        mapper.delUserById(20);


    }


}