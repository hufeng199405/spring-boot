package user.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import user.service.UserService;

/**
 * 类备注：
 *
 * @author Administrator
 * @version 1.0
 * @date 2018-01-28 17:40
 * @desc
 * @since 1.8
 */

@RestController
public class LoginController {

    private UserService userServiceImpl;

    // 可以配置多个映射url
    @RequestMapping(value = {"/","/index.html"})
    public ModelAndView loginPage(){

        return new ModelAndView("index");
    }
}
