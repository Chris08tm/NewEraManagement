package com.neweramngmnt.neweramanagement.Service;

import com.neweramngmnt.neweramanagement.Entity.Client;
import com.neweramngmnt.neweramanagement.Repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class ClientServiceImpl implements ClientService{

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public Client saveClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public List<Client> fetchClients() {
        return clientRepository.findAll();
    }

    @Override
    public Client fetchClientById(Long id) {
        return clientRepository.findById(id).get();
    }

    @Override
    public void deleteClientById(Long id) {
        clientRepository.deleteById(id);
    }

    @Override
    public Client updateClientById(Long id, Client client) {
        Client currClient = fetchClientById(id);

        if(Objects.nonNull(client.getClientName()) && !"".equalsIgnoreCase(client.getClientName())){
            currClient.setClientName(client.getClientName());
        }
        if(Objects.nonNull(client.getClientAddress()) && !"".equalsIgnoreCase(client.getClientAddress())){
            currClient.setClientAddress(client.getClientAddress());
        }
        if(Objects.nonNull(client.getClientBirthDate()) && !"".equalsIgnoreCase(client.getClientBirthDate())) {
            currClient.setClientBirthDate(client.getClientBirthDate());
        }

        return clientRepository.save(currClient);
    }


}
