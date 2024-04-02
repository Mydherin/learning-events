package local.learning.companies.infrastructure;

import local.learning.companies.application.companies.EventBus;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaEventBus implements EventBus {
    @Value("${kafka.topics.company.created}")
    private String topicName;

    private final KafkaTemplate kafkaTemplate;

    @Override
    public void publish(Object event) {
        this.kafkaTemplate.send(this.topicName, event);
    }
}
