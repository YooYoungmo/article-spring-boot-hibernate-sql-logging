package ymyoo.hibernate.logging;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ymyoo.hibernate.logging.entity.Member;
import ymyoo.hibernate.logging.repository.MemberRepository;

@SpringBootApplication
public class HibernateSqlLoggingApplication {

    public static void main(String[] args) {
        SpringApplication.run(HibernateSqlLoggingApplication.class, args);
    }

    @Bean
    public CommandLineRunner initData(MemberRepository repository) {
        return (args) -> {
            repository.save(new Member("ymyoo", "Seoul"));
        };
    }
}
