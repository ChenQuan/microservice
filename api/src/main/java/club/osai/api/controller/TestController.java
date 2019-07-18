package club.osai.api.controller;

import club.osai.serviceclient.TestClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * @Author: Chen Quan
 * @GitHub: https://github.com/chenquan
 * @Email: chenquan@osai.club
 * @Class: TestController.java
 * @Version: 1.0
 * @Date: 2019/7/18
 * @Description:
 */

@RestController
public class TestController {
    private final TestClient testClient;

    public TestController(TestClient testClient) {
        this.testClient = testClient;
    }

    @RequestMapping("/test")
    public String getTestClient(@RequestParam("str") String string) {
        Random random = new Random();
        return testClient.testService(string) +random.nextInt();
    }
}
