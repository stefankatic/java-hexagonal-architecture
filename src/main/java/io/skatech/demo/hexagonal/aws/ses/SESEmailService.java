package io.skatech.demo.hexagonal.aws.ses;

import io.skatech.demo.hexagonal.application.model.Email;
import io.skatech.demo.hexagonal.application.service.EmailGateway;

public class SESEmailService implements EmailGateway {

  @Override
  public void send(Email email) {

  }
}
