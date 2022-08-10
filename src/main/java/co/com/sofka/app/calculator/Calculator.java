package co.com.sofka.app.calculator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Calculator {
    public Long sum(Long a, Long b) {
        log.info("Summing {} + {}", a, b);
        return a + b;
    }

    //TODO complete all arithmetical operations.
    //NOTE: take a/0 into account.
}
