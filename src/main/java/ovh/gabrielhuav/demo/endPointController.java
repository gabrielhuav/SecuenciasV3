package ovh.gabrielhuav.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@RestController
public class EndPointController {
    public static void main(String[] args) {
        SpringApplication.run(EndPointController.class, args);
    }

    @PutMapping("/api/sequence/collatz/{input}")
    public Map<String, String> putCollatz(@PathVariable("input") Integer input) {
        return collatzSequence(input);
    }

    @GetMapping("/api/sequence/collatz/{input}")
    public Map<String, String> getCollatz(@PathVariable("input") Integer input) {
        return collatzSequence(input);
    }

    @GetMapping("/api/sequence/collatz")
    public Map<String, String> getDefaultCollatz() {
        return collatzSequence(20); // default value
    }

    private Map<String, String> collatzSequence(Integer input) {
        StringBuilder sequence = new StringBuilder();
        sequence.append(input).append(" ");

        while (input != 1) {
            if (input % 2 == 0) {
                input = input / 2;
            } else {
                input = 3 * input + 1;
            }
            sequence.append(input).append(" ");
        }

        Map<String, String> response = new HashMap<>();
        response.put("sequence", sequence.toString());
        return response;
    }
}