package info.jab.ms.req1;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping(path = "api/v1", produces = MediaType.APPLICATION_JSON_VALUE)
public class Req1Controller {

    @GetMapping("req1")
    public String process(@RequestParam(defaultValue = "1") String latency) {
        Integer latencyValue = Integer.parseInt(latency);
        // var vthread = Thread.startVirtualThread();
        // vthread.sleep();
        // var pThread = Thread.ofPlatform();
        // pThread.sleep();
        try {
            Thread.sleep(latencyValue * 1000);
        } catch (InterruptedException e) {
            // Empty
        }
        return "Hello World";
    }

}