package com.mycompany.app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by stewart.wachs on 8/17/17.
 */

@RestController
public class HelloController {

    @RequestMapping("/yo-bro")
    public String index() {
        return "Yo Bro";
    }
}
