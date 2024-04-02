package local.learning.users.application.users;

import local.learning.users.domain.users.companies.UserCompanyCreatedEvent;
import local.learning.users.infrastructure.shared.RabbitMqConfiguration;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateCompanyUseCase {

    @RabbitListener(queues = RabbitMqConfiguration.QUEUE_NAME)
    public void handle(final UserCompanyCreatedEvent userCompanyCreatedEvent) {
        System.out.println("Created");
    }

}
