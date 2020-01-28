package hoon.byeungo;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.core.env.Environment;

import java.io.PrintStream;

@SpringBootApplication
public class SpringinitApplication {

    public static void main(String[] args) {

        /*
        //이렇게 실행해야 커스터마이징 가능
        SpringApplication app = new SpringApplication(SpringinitApplication.class);
        // 코드로 배너 만들기 우선순위는 txt > 자바 소스
        app.setBanner(new Banner() {
            @Override
            public void printBanner(Environment environment, Class<?> sourceClass, PrintStream out) {
                out.println("===============================");
                out.println("hoon java spring banner");
                out.println("===============================");
            }
        });
        //app.setBannerMode(Banner.Mode.OFF);  //배너 끄기
        app.run(args);
        */

        //SpringApplicationBuilder 패턴 사용
        new SpringApplicationBuilder()
                .sources(SpringinitApplication.class)
                .banner(new Banner() {
                    @Override
                    public void printBanner(Environment environment, Class<?> sourceClass, PrintStream out) {
                        out.println("===============================");
                        out.println("hoon java spring banner");
                        out.println("===============================");
                    }
                })
                .run(args);
    }

}
