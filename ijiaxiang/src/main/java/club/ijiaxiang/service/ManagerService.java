package club.ijiaxiang.service;


import club.ijiaxiang.pojo.Manager;

import java.util.List;

public interface ManagerService {
    public List<Manager> findAll();
    Manager findByPhoneAndPwd(String mphone,String mpwd);
}
