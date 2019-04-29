package io.mine.ft.train.web.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 项目心跳监测接口
 */
@Controller
public class ZBJCheckController {
  

    @RequestMapping(value = "/zbjcheck", method = RequestMethod.GET)
    @ResponseBody
    public String zbjcheck() {
    	return "ok";
    }
}
