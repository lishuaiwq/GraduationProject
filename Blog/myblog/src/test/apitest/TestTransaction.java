package apitest;

import com.blog.entity.User;
import com.blog.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * @Author:shui.li
 * @Date:2019/3/2117:30
 */
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml","classpath:spring-mvc.xml"})
public class TestTransaction extends AbstractJUnit4SpringContextTests {
    @Autowired
    private UserService userService;

    @Test
    public void testSave(){
        User user = new User();
        user.setNickName("封剑主-叹希奇");
        user.setEmail("123456@qq.com");
        userService.regist(user);
    }
}
