package application.service;

import application.dao.TestDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TestService {

    @Resource
    private TestDao testDao;

    public String getBlog(){
        return testDao.getBlogList();
    }


}
