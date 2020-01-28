package hoon.byeun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Springinit2Application {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Springinit2Application.class);
        app.addListeners(new SampleListener()); //직접 리스너 등록
        app.setWebApplicationType(WebApplicationType.NONE);  //기본적으로 1.Spring MVC가 들어있으면 SERVLET으로 돔. 2.Spring Web 플럭스가 들어있으면 REACTIVE로 돔. 둘다 없으면 NONE으로 돔
        app.run(args);
    }

}
