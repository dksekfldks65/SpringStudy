package hoon.byeun;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class SampleListener2 implements ApplicationListener<ApplicationStartedEvent> { //어떤 이벤트 리스너를 만들지 타입을 줘야함

    @Override
    public void onApplicationEvent(ApplicationStartedEvent applicationStartedEvent) {
        System.out.println("=======================");
        System.out.println("Application is started");
        System.out.println("=======================");
    }

}
