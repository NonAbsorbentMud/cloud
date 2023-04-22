package own.cfb.ribbon.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import own.cfb.ribbon.service.TestService;

@Service("testService")
public class TestServiceImpl implements TestService {
    @Autowired
    RestTemplate restTemplate;

    @Override
    @HystrixCommand(fallbackMethod = "notFoundService")
    public String testExample(String name) {
        return restTemplate.getForObject("http://client/tc?name="+name, String.class);
    }
    public String notFoundService(String name){
        return "notFoundService";
    }
}
