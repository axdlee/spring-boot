package com.bee.sample.ch1.conntroller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Sheldon
 * User: sheldon
 * Date: 18-8-17
 * Time: 下午6:08
 *
 * @author Sheldon Lee <xdlee110@gmail.com>
 * @link https://www.yeelight.com
 */
@RestController
public class UserReditRestController {
    @RequestMapping(value = "/usercredit/{id}")
    public Integer getCreditLevel(@PathVariable String id) {
        //模拟用户的信用等级
        return 3;
    }
}
