package baizhi.controller;

import baizhi.entity.User;
import baizhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
   @RequestMapping("All")
    public Map getAll(){
        List<User>list=userService.getAll();
        Map map=new HashMap();
        map.put("list",list);
        return map;
    }
}
