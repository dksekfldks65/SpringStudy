package hoon.byeungoo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringtomcatApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(SpringtomcatApplication.class);
        application.run(args);
    }

}
