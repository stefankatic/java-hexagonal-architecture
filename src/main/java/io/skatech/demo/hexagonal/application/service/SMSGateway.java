package io.skatech.demo.hexagonal.application.service;

import io.skatech.demo.hexagonal.application.model.SMS;

public interface SMSGateway {
  void send(SMS sms);
}
