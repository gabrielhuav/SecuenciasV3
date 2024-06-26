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

    @GetMapping("/fizzbuzz3")
    public String fizzbuzz(@RequestParam(value = "n", defaultValue = "15") int n) {
        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            result.append(fizzBuzzFunction(i)).append("\n");
        }

        return result.toString();
    }

    private String fizzBuzzFunction(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz";
        } else if (n % 3 == 0) {
            return "Fizz";
        } else if (n % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(n);
        }
    }
}