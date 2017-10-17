package base.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/**
 *
 * @author Adam Scherer
 * @since 1.0
 */
@RestController
public class UptestController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/uptest")
    public Map<String, Object> defaultHandler(@RequestParam(value="name", defaultValue="World") String name) {
        Map<String, Object> data = new HashMap<>();
        data.put("counter", counter.incrementAndGet());
        data.put("data", String.format(template, name));

        return data;
    }
}
