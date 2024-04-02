package local.learning.users.infrastructure.shared;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
@EnableKafka
public class KafkaConfiguration {

    @Value("${kafka.topics.company.created}")
    private String topicName;

    @Bean
    public NewTopic companyCreatedTopic() {
        return TopicBuilder.name(this.topicName)
                .partitions(1)  // Ajusta este valor según tus necesidades de escalabilidad
                .replicas(1)    // Ajusta este valor según tus necesidades de disponibilidad
                .build();
    }
}
