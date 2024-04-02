package local.learning.users.infrastructure.users.listener;

import local.learning.users.application.users.company.CreateCompanyUseCase;
import local.learning.users.domain.users.companies.UserCompanyCreatedEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class UserListener {

    private final CreateCompanyUseCase createCompanyUseCase;

    @KafkaListener(topics = "${kafka.topics.company.created}")
    public void createCompany(final UserCompanyCreatedEvent event) {
        this.createCompanyUseCase.handle(null);
    }


}
