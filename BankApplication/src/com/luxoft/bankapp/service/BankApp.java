package com.luxoft.bankapp.service;
import com.luxoft.bankapp.domain.Account;
import com.luxoft.bankapp.domain.Bank;
import com.luxoft.bankapp.domain.CheckingAccount;
import com.luxoft.bankapp.domain.Client;
import com.luxoft.bankapp.domain.Gender;
import com.luxoft.bankapp.domain.SavingAccount;
import com.luxoft.bankapp.service.BankService;
public class BankApp {

    public static void main(String[] args) {
	Bank bank = new Bank();
    Client clientFemale = new Client("Karina", Gender.FEMALE);
    Client clientMale = new Client("Josh", Gender.MALE);
    Account account1 = new Account(1, 150);
    Account account2 = new Account(2,400);
    bank.addClient(clientMale);
    bank.addClient(clientFemale);

    clientFemale.addAccount(account1);
    clientMale.addAccount(account2);
    account1.diposit(5000);
    account2.diposit(3000);

    System.out.println(clientFemale.getClientGreeting());
    System.out.println(clientMale.getClientGreeting());
    System.out.println(clientFemale.toString());
    System.out.println(clientMale.toString());

    }
}
