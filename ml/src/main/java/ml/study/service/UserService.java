package ml.study.service;

import ml.study.mapper.UserMapper;
import ml.study.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author hemingliang-1291
 * @date 2018/5/11 18:42
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    @Transactional(readOnly = true)
    public User queryUserById(Integer id) {
        User user = new User();
        user.setId(id);
        return userMapper.selectOne(user);
    }

    @Transactional()
    public void save(User user) {
        userMapper.insert(user);
    }
}
