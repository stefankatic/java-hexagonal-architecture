package io.skatech.demo.hexagonal.application.service;

import io.skatech.demo.hexagonal.application.model.Email;

public interface EmailGateway {

  void send(Email email);

}
