package club.ijiaxiang.dao;

import club.ijiaxiang.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by zhulin on 2017/4/27.
 * Description:user数据库映射接口
 */
@Repository("UserDao")
public interface UserDao {
    List<User> findAllUser();
}
