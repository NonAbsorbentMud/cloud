package own.cfb.ribbon.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import own.cfb.ribbon.service.TestService;

@RestController
public class TestRest {

    @Autowired
    TestService testService;
    @RequestMapping("/tr")
    public String tr(@RequestParam("name") String name){
        return testService.testExample(name);
    }
}
