package club.ijiaxiang.service.impl;

import club.ijiaxiang.dao.ManagerDao;
import club.ijiaxiang.pojo.Manager;
import club.ijiaxiang.service.ManagerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("ManagerService")
public class ManagerServiceImpl implements ManagerService {
    @Resource(name="ManagerDao")
    ManagerDao dao;


    @Override
    public List<Manager> findAll() {
        return dao.findAll();
    }

    @Override
    public Manager findByPhoneAndPwd(String mphone, String mpwd) {
        return dao.findByPhoneAndPwd(mphone,mpwd);
    }
}

