package ovh.gabrielhuav.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class serieCollatz {
    public static void main(String[] args) {
        SpringApplication.run(serieCollatz.class, args);
    }

    @GetMapping("/collatz")
    public String collatz(@RequestParam(value = "number", defaultValue = "18") int number) {
        StringBuilder sequence = new StringBuilder();
        sequence.append(number).append(" ");

        while (number!= 1) {
            if (number % 2 == 0) {
                number = number / 2;
            } else {
                number = 3 * number + 1;
            }
            sequence.append(number).append(" ");
        }

        return sequence.toString();
    }
}