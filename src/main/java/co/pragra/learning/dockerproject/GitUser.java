package co.pragra.learning.dockerproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GitUser {

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
