package club.ijiaxiang.service.impl;

import club.ijiaxiang.dao.UserDao;
import club.ijiaxiang.pojo.User;
import club.ijiaxiang.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zhulin on 2017/4/27.
 * Description:
 */

@Service("UserService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Override
    public List<User> findAllUser() {
        return userDao.findAllUser();
    }
}
