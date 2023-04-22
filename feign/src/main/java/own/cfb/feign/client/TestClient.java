package own.cfb.feign.client;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import own.cfb.feign.client.impl.HystrixTestClientImpl;

// @FeignClient(value="client",fallback = HystrixTestClientImpl.class)
@FeignClient(value="client")
public interface TestClient {
    @RequestMapping("/tc")
    //@HystrixCommand
    public String testExample(@RequestParam("name") String name);
}
