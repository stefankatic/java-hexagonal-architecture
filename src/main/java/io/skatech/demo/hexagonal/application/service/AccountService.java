package io.skatech.demo.hexagonal.application.service;

import io.skatech.demo.hexagonal.application.repository.AccountRepository;

public class AccountService {

  private final AccountRepository repository;
  private final SMSGateway smsGateway;
  private final EmailGateway emailGateway;

  public AccountService(
      AccountRepository repository,
      SMSGateway smsGateway,
      EmailGateway emailGateway
  ) {
    this.repository = repository;
    this.smsGateway = smsGateway;
    this.emailGateway = emailGateway;
  }
}
