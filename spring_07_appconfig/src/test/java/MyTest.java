import com.yaozhou.config.MyConfig;
import com.yaozhou.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by WXHang on HANG at 2021/7/8 0:21
 */
public class MyTest {
    @Test
    public void MyConfigTest(){
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        User user = (User) context.getBean("getUser");
        System.out.println(user.getName());
    }
}