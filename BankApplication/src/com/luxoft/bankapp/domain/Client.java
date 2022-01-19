package com.luxoft.bankapp.domain ;

import java.util.List;
import java.util.ArrayList;

public class Client {
     private String name;
     private List<Account> accounts = new ArrayList<>();
     private final Gender gender;

     public Client( String name,  Gender gender)
     { this.name = name;
       this.gender = gender;

     }


    /* public void getClientGreeting(){
          if (gender == Gender.MALE)
          {System.out.println("Hello, Mr." + name);}
          else if (gender == Gender.FEMALE)
          { System.out.println("Hello, Ms." + name);}
     }*/

    public void addAccount( Account account)
     {
      accounts.add(account);
     }
     public List<Account> getAccounts()
     {
          return accounts;
     }
    public String getClientGreeting(){
        return String.format("Hello," + gender.getGreetingPrefix()+ name);
    }
    @Override
    public String toString(){
        return "Client{" + "name: " +name + ", accounts: " + accounts + ", gender: "+ gender + "}";
    }
}
