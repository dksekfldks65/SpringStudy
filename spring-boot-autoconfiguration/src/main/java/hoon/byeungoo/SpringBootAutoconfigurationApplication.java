package hoon.byeungoo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootAutoconfigurationApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(SpringBootAutoconfigurationApplication.class);
        application.setWebApplicationType(WebApplicationType.NONE);
        application.run(args);
    }

    /*
    @Bean
    public Holoman holoman(){      //HolomanConfiguration Class에 이미 정의했는데 또다시 overriding 하려고해서 문제가 생길 수 있음.
                                   //overriding 하더라도 autoconfiguration에 의해 덮어씌워짐
        Holoman holoman = new Holoman();
        holoman.setName("hoon");
        holoman.setHowLong(60);
        return holoman;
    }
    */
}
