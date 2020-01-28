package hoon.byeungoo;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {  //모든 컨트롤러에 애노테이션 안붙이고 CORS 설정 가능
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:18080");

    }
}
