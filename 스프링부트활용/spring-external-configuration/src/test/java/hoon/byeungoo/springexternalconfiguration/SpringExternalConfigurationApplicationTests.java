package hoon.byeungoo.springexternalconfiguration;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.TestPropertySource;

import static org.assertj.core.api.Assertions.assertThat;

//@TestPropertySource(properties = "goohoon.name=hoon3") //2순위
//@SpringBootTest(properties = "goohoon.name=hoon2") //3순위
@TestPropertySource(locations = "classpath:/test.properties")
@SpringBootTest
class SpringExternalConfigurationApplicationTests {

    @Autowired
    Environment environment;

    @Test
    void contextLoads() {
        assertThat(environment.getProperty("goohoon.name")).isEqualTo("goohoon2");

    }

}
