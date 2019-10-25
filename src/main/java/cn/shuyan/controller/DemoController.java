package cn.shuyan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author ShuYan.Li
 * @classDesc:
 * @date 2019/10/25/025  15:51
 */
@Controller
public class DemoController {

    @RequestMapping(value = "/demo", method = RequestMethod.GET)
    @ResponseBody
    public String demo() {
        return "Hello World";
    }
}
