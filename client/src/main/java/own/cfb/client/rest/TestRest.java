package own.cfb.client.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestRest {

    @Value("${server.port}")
    String port;

    @RequestMapping("/tc")
    public String tc(@RequestParam("name") String name){
        String str=name+"------"+port;
        return str;
    }
    @Bean
    public AlwaysSampler defaultSampler(){
        return new AlwaysSampler();
    }
}
