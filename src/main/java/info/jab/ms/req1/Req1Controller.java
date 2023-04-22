package info.jab.ms.req1;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.concurrent.TimeUnit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping(path = "api/v1", produces = MediaType.APPLICATION_JSON_VALUE)
public class Req1Controller {

    private static Logger logger = LoggerFactory.getLogger(Req1Controller.class);

    @GetMapping("req1")
    public String process(@RequestParam(defaultValue = "1") String latency) {
        logger.info("Running endpoint /api/v1/req1");
        int latencyValue = Integer.valueOf(latency);
        logger.info("Emulating a process which last {} seconds", latencyValue);
        sleep(latencyValue);
        return "Hello World";
    }

    private void sleep(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            // Empty
        }
    }

}