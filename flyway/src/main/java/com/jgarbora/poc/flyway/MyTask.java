package com.jgarbora.poc.flyway;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MyTask {

    @Scheduled(fixedDelay = 1000000)
    public void doNothing() {
        log.info("doing nothing");
    }
}
