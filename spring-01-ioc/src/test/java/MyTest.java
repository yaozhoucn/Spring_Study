import com.yaozhou.dao.UserDao;
import com.yaozhou.dao.UserDaoImpl;
import com.yaozhou.service.UserService;
import com.yaozhou.service.UserServiceImpl;
import org.junit.Test;

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
}