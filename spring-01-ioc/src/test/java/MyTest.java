import com.yaozhou.dao.UserDaoImpl;
import com.yaozhou.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by WXHang on HANG at 2021/7/6 23:27
 */
public class MyTest {
    @Test
    public void Test1(){
        UserServiceImpl userService = new UserServiceImpl();
        userService.setUserDao(new UserDaoImpl());
        userService.getUser();
    }
    @Test
    public void Spring_Test1(){
        //读取xml文件，获取文件里面的信息
        //获取ApplicationContext：拿到Spring的容器
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Object hello = context.getBean("hello");
        System.out.println(hello.toString());
    }
}