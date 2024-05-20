package com.example.springdigitaloceanappplatform;

import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class AppController {

    @RequestMapping("/")
    public Map<String, String> hello(@RequestBody(required = false) String body) {
        log.info("Hit Endpoint hello");
        log.info("Response body: {}", body);
        return Map.of("status", "ok");
    }
}
