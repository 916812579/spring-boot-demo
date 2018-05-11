package ml.study.service;

import ml.study.Application;
import ml.study.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author hemingliang-1291
 * @date 2018/5/11 19:00
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void queryUserByIdTest() {
        userService.queryUserById(1);
    }

    @Test
    @Transactional
    @Rollback
    public void saveTest() {
        User user = new User();
        user.setName("test");
        userService.save(user);
    }
}
