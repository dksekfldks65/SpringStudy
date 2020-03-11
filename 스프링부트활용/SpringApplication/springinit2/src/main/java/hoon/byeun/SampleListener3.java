package hoon.byeun;

import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

@Component
public class SampleListener3 {


    public SampleListener3(ApplicationArguments arguments) {
        //둘다 콘솔로들어오는건 똑같음
        //-D로 오는거는 VM 옵션으로 침
        System.out.println("foo: " + arguments.containsOption("foo")); //false
        //--로 오는거만 arguments로 씀
        System.out.println("bar: " + arguments.containsOption("bar")); //true
    }

}
