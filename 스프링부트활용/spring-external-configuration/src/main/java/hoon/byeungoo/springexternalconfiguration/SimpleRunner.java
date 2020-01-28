package hoon.byeungoo.springexternalconfiguration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SimpleRunner implements ApplicationRunner {

    @Value("${goohoon.name}")
    private String name;

    @Value("${goohoon.age}")
    private int age;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("======================================");
        System.out.println(name);
        System.out.println(age);
        System.out.println("======================================");
    }
}
