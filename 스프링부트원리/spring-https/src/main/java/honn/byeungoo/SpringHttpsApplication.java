package honn.byeungoo;

import org.apache.catalina.connector.Connector;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringHttpsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringHttpsApplication.class, args);
    }

    @Bean
    public ServletWebServerFactory awecweFactory(){
        TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory();
        tomcat.addAdditionalTomcatConnectors(createStandardConnect());

        return tomcat;
    }

    //HTTP도 가능하도록 Connector 추가.
    private Connector createStandardConnect(){
        Connector connector = new Connector("org.apache.coyote.http1");
        connector.setPort(8080);
        return connector;
    }

}
