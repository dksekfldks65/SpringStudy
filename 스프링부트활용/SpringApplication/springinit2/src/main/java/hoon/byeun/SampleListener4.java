package hoon.byeun;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleListener4 implements ApplicationRunner { //애플리케이션 실행 뒤 실행하고 싶을 때 사용

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("ApplicationRunner"); //false
        System.out.println("foo: " + args.containsOption("foo")); //false
        //--로 오는거만 arguments로 씀
        System.out.println("bar: " + args.containsOption("bar")); //true
    }
}
