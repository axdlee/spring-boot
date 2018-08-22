package com.bee.sample.ch1.conntroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Sheldon
 * User: sheldon
 * Date: 18-8-17
 * Time: 下午5:32
 *
 * @author Sheldon Lee <xdlee110@gmail.com>
 * @link https://www.yeelight.com
 */
@Controller
public class HelloWorldController {
    @RequestMapping("/sayhello.html")
    public @ResponseBody String say() {
        return "Hello Spring Boot!";
    }
}
