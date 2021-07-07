import com.yaozhou.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by WXHang on HANG at 2021/7/7 18:51
 * Desc：
 */
public class MyTest {
    @Test
    public void AnnoTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user);
    }
}
