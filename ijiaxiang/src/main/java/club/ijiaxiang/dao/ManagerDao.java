package club.ijiaxiang.dao;


import club.ijiaxiang.pojo.Manager;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("ManagerDao")
public interface ManagerDao{
    List<Manager> findAll();
    Manager findByPhoneAndPwd(@Param("mphone")String mphone,@Param("mpwd")String mpwd);
}
