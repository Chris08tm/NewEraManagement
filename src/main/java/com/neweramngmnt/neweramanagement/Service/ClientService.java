package com.neweramngmnt.neweramanagement.Service;

import com.neweramngmnt.neweramanagement.Entity.Client;

import java.util.List;

public interface ClientService {
    public Client saveClient(Client client);
    public List<Client> fetchClients();
    public void deleteClientById(Long id);
    public Client updateClientById(Long id, Client client);

    Client fetchClientById(Long id);
}
