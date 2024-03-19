import com.summer.SummerApplicationContext;
import com.yilu.AppConfig;
import service.UserService;

public class Test {
    @org.junit.Test
    public void test() {
        SummerApplicationContext applicationContext = new SummerApplicationContext(AppConfig.class);
        Object userService = applicationContext.getBean("userService");
    }
}
