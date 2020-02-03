package hoon.byeun.Account;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest  //슬라이싱 테스트. 임베디드 DB로 돌려야 빠름. 이 방법 추천
//@SpringBootTest   통합테스트. 느림. 테스트용디비가 필요함. 테스트를 통해 repository를 바꾸면 디비에 테스트 데이터가 바뀜
class AccountRepositoryTest {

    @Autowired
    DataSource dataSource;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    AccountRepository accountRepository;

    @Test
    public void di() throws SQLException {

        try(Connection connection = dataSource.getConnection()){
            DatabaseMetaData metaData = connection.getMetaData();
            System.out.println(metaData.getURL());
            System.out.println(metaData.getDriverName());
            System.out.println(metaData.getUserName());
        }


        Account account = new Account();
        account.setUserName("hoon");
        account.setPassword("pass");

        Account newAccount = accountRepository.save(account);

        assertThat(newAccount).isNotNull();

        Account existingAccount = accountRepository.findByUserName(newAccount.getUserName());
        assertThat(existingAccount).isNotNull();

        Account nonExistingAccount = accountRepository.findByUserName("byeun");
        assertThat(nonExistingAccount).isNull();

    }

}