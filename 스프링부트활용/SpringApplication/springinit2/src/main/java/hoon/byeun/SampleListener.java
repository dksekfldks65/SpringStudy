package hoon.byeun;

import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;

//@Component    //bean으로 등록을 하면 등록되어 있는 bean중에 해당하는 이벤트에 대한 리스너가 알아서 작동함. 하지만 ioc 컨테이너 만들기 이전의 이벤트는 의미가 없어서 Componet 등록 필요없음
public class SampleListener implements ApplicationListener<ApplicationStartingEvent> { //어떤 이벤트 리스너를 만들지 타입을 줘야함

    @Override
    public void onApplicationEvent(ApplicationStartingEvent applicationStartingEvent) {
        System.out.println("=======================");
        System.out.println("Application is starting");
        System.out.println("=======================");
    }

}
