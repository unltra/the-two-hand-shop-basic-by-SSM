package top.unltra.ssm.controller;
/**
    *Demo class
	*@author lnz86
	*@date 2018年3月25日 下午6:20:16
	*
	*/
import javax.annotation.Resource;  
import javax.servlet.http.HttpServletRequest;  
  
import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.RequestMapping;

import top.unltra.ssm.domain.user;
import top.unltra.ssm.service.UserService;  
  

  
@Controller  
@RequestMapping("/user")  
public class UserController {  
    @Resource  
    private UserService userService;  
      
    @RequestMapping("/showUser")  
    public String toIndex(HttpServletRequest request,Model model){  
        int Uid = Integer.parseInt(request.getParameter("Uid"));  
        user user = this.userService.getUserByUid(Uid);  
        model.addAttribute("user", user);  
        return "showUser";  
    } 
    
    @RequestMapping("/delUser")  
    public String delUser(HttpServletRequest request,Model model){  
        int Uid = Integer.parseInt(request.getParameter("Uid"));  
        user user = this.userService.getUserByUid(Uid);
        model.addAttribute("user", user);
        this.userService.deleteUserByUid(Uid);  
        return "delUser";  
    }  
}  