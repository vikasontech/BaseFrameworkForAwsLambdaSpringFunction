package vik.automation.TelegramMessagePoller;

import com.fasterxml.jackson.databind.ObjectMapper;
import domain.requests.TelegramMessageRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;

import java.util.function.Function;

@SpringBootApplication
public class BuxferClient {
  private Logger log = LoggerFactory.getLogger(this.getClass().getName());

  public static void main(String[] args) {
    SpringApplication.run(BuxferClient.class, args);
  }

  @Bean
  public ObjectMapper mapper() {
    return new ObjectMapper()
        .findAndRegisterModules();
  }

  @Bean
  public Function<Message<TelegramMessageRequest>, Message<String>> consumeTelegramMessage() {
    return it -> {
      log.info(it.getPayload().getClass().getName());
      log.info("request1: " + it.getPayload());
      return MessageBuilder.withPayload(" something is happing %%%% ").build();
    };
  }
}
