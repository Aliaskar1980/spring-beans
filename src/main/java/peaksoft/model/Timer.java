package peaksoft.model;

import org.springframework.stereotype.Component;

@Component
public class Timer {

    private Long nanoTime = System.nanoTime();
    private Long nanoTime1 = System.nanoTime();

    public Long getTime() {
        return nanoTime;
    }


}
