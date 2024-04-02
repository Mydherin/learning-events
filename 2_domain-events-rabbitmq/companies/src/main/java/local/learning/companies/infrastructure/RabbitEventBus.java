package local.learning.companies.infrastructure;

import local.learning.companies.application.companies.EventBus;
import local.learning.companies.infrastructure.shared.RabbitMqConfiguration;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RabbitEventBus implements EventBus {
    private final RabbitTemplate rabbitTemplate;

    @Override
    public void publish(Object event) {
        this.rabbitTemplate.convertAndSend(RabbitMqConfiguration.EXCHANGE_NAME, RabbitMqConfiguration.ROUTING_KEY, event);

    }
}
