package spitter.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by liumolong on 18/4/22.
 */
@Controller
@RequestMapping({"/","/homepage"})
public class HomeController {
    @RequestMapping(method = RequestMethod.GET)
    public String home(){
        //试图名
        return "home";
    }
}
