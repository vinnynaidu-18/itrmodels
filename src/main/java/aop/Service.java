package aop;

import org.springframework.stereotype.Component;
    @Component
    public class Service {
        @TimeExecution
        public void serve() throws InterruptedException {
            Thread.sleep(2000);
        }
    }
