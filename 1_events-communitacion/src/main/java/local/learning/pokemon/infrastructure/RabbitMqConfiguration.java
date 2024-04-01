package local.learning.pokemon.infrastructure;

import org.springframework.amqp.core.*;
import org.springframework.amqp.support.converter.SimpleMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Collections;

@Configuration
public class RabbitMqConfiguration {
    public static final String QUEUE_NAME = "team.created.queue";
    public static final String EXCHANGE_NAME = "team.created.exchange";
    public static final String ROUTING_KEY = "team.created.rk";
    public static final String NAMESPACE_EVENTS = "local.learning.pokemon.infrastructure.out.*";

    @Bean
    Queue queue() {
        return new Queue(QUEUE_NAME, false);
    }

    @Bean
    TopicExchange exchange() {
        return new TopicExchange(EXCHANGE_NAME);
    }

    @Bean
    Binding binding(Queue queue, TopicExchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with(ROUTING_KEY);
    }

    @Bean
    public SimpleMessageConverter messageConverter() {
        SimpleMessageConverter converter = new SimpleMessageConverter();
        // Especificar las clases permitidas
        converter.setAllowedListPatterns(Collections.singletonList(NAMESPACE_EVENTS));
        return converter;
    }
}
