package club.osai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Chen Quan
 * @GitHub: https://github.com/chenquan
 * @Email: chenquan@osai.club
 * @Class: TsetController.java
 * @Version: 1.0
 * @Date: 2019/7/18
 * @Description:
 */
@RestController
public class TestController {
    @Autowired
    private TestService testService;

    @RequestMapping("/test1")
    public String testService(@RequestParam("str") String str) {
        return testService.testService(str);
    }
}
