package ml.study.controller;

import ml.study.BusinessException;
import ml.study.model.User;
import ml.study.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hemingliang-1291
 * @date 2018/5/14 9:56
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/{id}")
    public User getUser(@PathVariable(value = "id") Integer id) {
        throw new BusinessException("出错了");
        //return new User();
    }
}
