package own.cfb.feign.client.impl;

import org.springframework.stereotype.Component;
import own.cfb.feign.client.TestClient;

@Component
public class HystrixTestClientImpl implements TestClient{
    public String testExample(String name) {
        return "Feign:Service is not found";
    }
}
