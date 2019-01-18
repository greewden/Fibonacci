package fibonacci.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FibonacciController {

    private FibonacciService fibonacciService;

    @Autowired
    FibonacciController(FibonacciService fibonacciService) {
        this.fibonacciService = fibonacciService;
    }

    @GetMapping("/fib")
    public long calcFibonacci(@RequestParam(value = "n") long n) {
        return fibonacciService.calculate(n);
    }
}
