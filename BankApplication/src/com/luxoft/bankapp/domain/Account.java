package com.luxoft.bankapp.domain;

public interface Account {
    public int getId();
    public double getBalance();

    public void diposit(double amount);

     public void withdraw(double amount);

  double maximumAmountToWithdraw();
}
