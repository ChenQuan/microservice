package club.osai.service;

import org.springframework.stereotype.Service;

/**
 * @Author: Chen Quan
 * @GitHub: https://github.com/chenquan
 * @Email: chenquan@osai.club
 * @Class: TestService.java
 * @Version: 1.0
 * @Date: 2019/7/18
 * @Description:
 */
@Service("testService")
public class TestService {

    public String testService(String str) {

        System.out.println("log----------" + str);
        return str;
    }
}
