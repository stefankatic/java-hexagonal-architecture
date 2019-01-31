package io.skatech.demo.hexagonal.application.model;

import java.util.List;

public class Account {
  private final List<Credentials> credentials;
  private final AccountDetails accountDetails;

  public Account(List<Credentials> credentials,
      AccountDetails accountDetails) {
    this.credentials = credentials;
    this.accountDetails = accountDetails;
  }

  public List<Credentials> getCredentials() {
    return credentials;
  }

  public AccountDetails getAccountDetails() {
    return accountDetails;
  }
}
