package local.learning.companies.infrastructure.shared;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"local.learning.companies"})
@EnableJpaRepositories(basePackages = "local.learning.companies.infrastructure")
@EntityScan("local.learning.companies.infrastructure")
public class CompaniesApplication {

    public static void main(String[] args) {
        SpringApplication.run(CompaniesApplication.class, args);
    }

}
