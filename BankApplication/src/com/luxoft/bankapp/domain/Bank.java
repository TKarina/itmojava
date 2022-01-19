package com.luxoft.bankapp.domain ;
import java.util.List;
import java.util.ArrayList;

public class Bank {
    private List<Client> clients = new ArrayList<>();

    public void addClient( Client client)
    {
      clients.add(client);
    }

    public List<Client> getClients() {
        return clients;
    }
}
