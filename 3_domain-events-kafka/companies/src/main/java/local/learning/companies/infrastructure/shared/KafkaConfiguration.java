package local.learning.companies.infrastructure.shared;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaConfiguration {
    @Bean
    public NewTopic companyCreatedTopic() {
        return TopicBuilder.name(topicName)
                .partitions(1)  // Ajusta este valor según tus necesidades de escalabilidad
                .replicas(1)    // Ajusta este valor según tus necesidades de disponibilidad
                .build();
    }
}
