package baizhi.test;

import baizhi.dao.UserDao;

import baizhi.entity.User;
import baizhi.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;



public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        System.out.println(context+"1111111111");
//        UserService service =  (UserService) context.getBean("userServiceImpl");
        UserDao userDao=(UserDao) context.getBean("userDao");
        List<User> users = userDao.getAll();
        for (User user : users) {
          System.out.println(user);
        }

    }
}
