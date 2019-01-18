package fibonacci.demo;

import org.springframework.stereotype.Service;

@Service
public class FibonacciService {
    public long calculate(long n) {
        if (n > 0) {
            return Fibonacci.calculate(n);
        }
        return 0;
    }
}
