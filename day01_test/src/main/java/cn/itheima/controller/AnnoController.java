package cn.itheima.controller;

import cn.itheima.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import java.util.Date;
import java.util.Map;

@Controller
@RequestMapping("/anno")
@SessionAttributes(value={"mvp"})
public class AnnoController  {

    /**
     * 常用注解RequestParam展示  属性 value name required(默认为true)
     * @param username
     * @return
     */
    @RequestMapping("/testRequestParam")
    public String testRequestParam(@RequestParam(name="name") String username){
        System.out.println("执行了...");
        System.out.println(username);
        return "success";
    }

    /**
     * 常用注解requestBody 的展示
     * @param body
     * @return
     */
    @RequestMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String body){
        System.out.println("执行了...");
        System.out.println(body);
        return "success";
    }

    /**
     *
     * @param id
     * @return
     */
    @RequestMapping("/testPathVariable/{sid}")
    public String testPathVariable(@PathVariable(name="sid") String id){
        System.out.println("执行了...");
        System.out.println(id);
        return "success";
    }

    /**
     *获取请求头
     * @param header
     * @return
     */
    @RequestMapping("/testRequestHeader")
    public String testRequestHeader(@RequestHeader(value="Accept") String header){
        System.out.println("执行了...");
        System.out.println(header);
        return "success";
    }

    /**
     * 获取指定Cookie的值
     * @param cookieValue
     * @return
     */
    @RequestMapping("/testCookieValue")
    public String testCookieValue(@CookieValue(value="JSESSIONID") String cookieValue){
        System.out.println("执行了...");
        System.out.println(cookieValue);
        return "success";
    }

    /**
     * ModelAttribute 注解  用于无参方法 用map来存储对象 同样用ModelAttribute取
     * @param user
     * @return
     */
    @RequestMapping("/testModelAttribute")
    public String testModelAttribute(@ModelAttribute("abc") User user){
        System.out.println("执行了...");
        System.out.println(user);
        return "success";
    }

    @ModelAttribute
    public void showUser(String uname, Map<String,User> map){
        System.out.println("showUser 执行了");
        User user = new User();
        user.setUname(uname);
        user.setAge(23);
        user.setDate(new Date());
        map.put("abc",user);
    }
   /* @ModelAttribute
    public User showUser(String uname){

        System.out.println("showUser 执行了");
        User user = new User();
        user.setUname(uname);
        user.setAge(23);
        user.setDate(new Date());

        return user;
    }*/

    @RequestMapping("/testSessionAttributes")
    public String testSessionAttributes(Model model){
        System.out.println("执行了...");
        model.addAttribute("mvp","美美");
        System.out.println();
        return "success";
    }

    @RequestMapping("/getSessionAttributes")
    public String getSessionAttributes(ModelMap model){

        System.out.println("执行了...");
        String o = (String)model.get("mvp");
        System.out.println(o);
        return "success";
    }
    @RequestMapping("/delSessionAttributes")
    public String delSessionAttributes(SessionStatus status){


        System.out.println("执行了...");
        status.setComplete();
        System.out.println("删了");
        return "success";
    }
}
