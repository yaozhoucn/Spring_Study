import com.yaozhou.pojo.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by WXHang on HANG at 2021/7/7 17:45
 * Desc：
 */
public class MyTest {
    @Test
    public void PeopleTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        People people = context.getBean("people", People.class);
        System.out.println(people);
        people.getDog().shot();
    }
}
