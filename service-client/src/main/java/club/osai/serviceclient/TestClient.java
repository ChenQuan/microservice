package club.osai.serviceclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: Chen Quan
 * @GitHub: https://github.com/chenquan
 * @Email: chenquan@osai.club
 * @Class: TestClinent.java
 * @Version: 1.0
 * @Date: 2019/7/18
 * @Description:
 */
@Repository
@FeignClient("service")
public interface TestClient {

    @RequestMapping("/test1")
    String testService(@RequestParam("str") String str);
}
