package io.skatech.demo.hexagonal.spring.configuration;

import io.skatech.demo.hexagonal.application.repository.AccountRepository;
import io.skatech.demo.hexagonal.application.service.EmailGateway;
import io.skatech.demo.hexagonal.application.service.AccountService;
import io.skatech.demo.hexagonal.application.service.SMSGateway;
import io.skatech.demo.hexagonal.aws.ses.SESEmailService;
import io.skatech.demo.hexagonal.aws.sns.SNSSMSGateway;
import io.skatech.demo.hexagonal.jpa.JpaAccountRepository;
import io.skatech.demo.hexagonal.mailgun.MailgunEmailGateway;
import io.skatech.demo.hexagonal.mongo.MongoAccountRepository;
import io.skatech.demo.hexagonal.twilio.TwilioSMSGateway;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

  @Bean
  public AccountService hexagonService(
      AccountRepository repository,
      SMSGateway smsGateway,
      EmailGateway emailGateway
  ) {
    return new AccountService(repository, smsGateway, emailGateway);
  }

  @Bean
  @ConditionalOnProperty(name = "database.use", havingValue = "mongo")
  public AccountRepository mongoRepository() {
    return new MongoAccountRepository();
  }

  @Bean
  @ConditionalOnProperty(name = "database.use", havingValue = "jpa")
  public AccountRepository jpaRepository() {
    return new JpaAccountRepository();
  }

  @Bean
  @ConditionalOnProperty(name = "sms.use", havingValue = "twilio")
  public SMSGateway twilioSMSGateway() {
    return new TwilioSMSGateway();
  }

  @Bean
  @ConditionalOnProperty(name = "sms.use", havingValue = "sns")
  public SMSGateway SNSSMSGateway() {
    return new SNSSMSGateway();
  }

  @Bean
  @ConditionalOnProperty(name = "email.use", havingValue = "ses")
  public EmailGateway sesEmailGateway() {
    return new SESEmailService();
  }

  @Bean
  @ConditionalOnProperty(name = "email.use", havingValue = "mailgun")
  public EmailGateway mailgunEmailGateway() {
    return new MailgunEmailGateway();
  }
}
