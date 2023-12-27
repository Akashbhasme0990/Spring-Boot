package skye.sky.dao;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Controller {
    @GetMapping("/sky123")
    private String New(){
        return  "Hello world";
    }
}
