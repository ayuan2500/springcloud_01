import com.itheima.SpringCloudDemo01RestTemplateApplication;
import org.junit.Test;


import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

/***
 * @ClassName RestTemplateTest
 * @Description RestTemplate入门案例测试
 * @version 1.0.0
 * @author ayuan
 * @createTime 2020/11/02 10:59:00
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringCloudDemo01RestTemplateApplication.class)
public class RestTemplateTest {
    //从Spring容器获取RestTemplate对象
    @Autowired
    private RestTemplate restTemplate;

    /***
     * @title Test01
     * @description 通过restTemplate发送请求获取指定url的数据，并获取响应自动序列化
     * @param
     * @return void
     * @author ayuan
     * @updateTime 2020/11/2 11:22
     */
    @Test
    public void Test01() {
        String url = "http://localhost:18081/user/list";
        String listStr = restTemplate.getForObject(url, String.class);
        System.out.println(listStr);
    }
}
