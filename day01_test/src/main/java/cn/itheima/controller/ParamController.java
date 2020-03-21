package cn.itheima.controller;

import cn.itheima.domain.Account;
import cn.itheima.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/param")
/**
 * 请求参数绑定
 */


public class ParamController {

    /**
     * 请求参数入门
     * @return
     */
    @RequestMapping("/testParam")
    public String testParam(String username){
        System.out.println("执行了...");
        System.out.println("用户名:"+username);
        return "success";
    }

    /**
     * 请求参数绑定 把请求参数绑定应用类型和复杂类型
     * @param account
     * @return
     */
    @RequestMapping("/testBean")
    public String testBean(Account account){
        System.out.println("执行了...");
        System.out.println(account);
        return "success";
    }
    /**
     * 请求参数绑定 把请求参数绑定应用类型和复杂类型
     * @param user
     * @return
     */
    @RequestMapping("/saveUser")
    public String testBean(User user){
        System.out.println("执行了...");
        System.out.println(user);
        return "success";
    }

    @RequestMapping("/testServlet")
    public String testServlet(HttpServletRequest request, HttpServletResponse response){
        System.out.println("执行了...");
        System.out.println(request);
        HttpSession session = request.getSession();
        System.out.println(session);
        ServletContext servletContext = session.getServletContext();
        System.out.println(servletContext);
        System.out.println(response);

        return "success";
    }
}
