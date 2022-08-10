package co.com.sofka.app.calculator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Calculator {
    public Long sum(Long a, Long b) {
        log.info("Summing {} and {}", a, b);
        return a + b;
    }

    public Long subtract(Long minuend, Long subtrahend) {
        log.info("Subtracting {} from {}", minuend, subtrahend);
        return minuend - subtrahend;
    }

    public Long multiply(Long a, Long b) {
        log.info("Multiplying {} by {}", a, b);
        return a * b;
    }

    //TODO complete all arithmetical operations.
    //NOTE: take a/0 into account.
}
