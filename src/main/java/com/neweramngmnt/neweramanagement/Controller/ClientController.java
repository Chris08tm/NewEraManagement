package com.neweramngmnt.neweramanagement.Controller;

import com.neweramngmnt.neweramanagement.Entity.Client;
import com.neweramngmnt.neweramanagement.Service.ClientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client") // https://localhost:8080/client
public class ClientController {

    @Autowired
    private ClientServiceImpl clientService;

    @PostMapping
    public Client saveClient(@RequestBody Client client){
        return clientService.saveClient(client);
    }

    @GetMapping
    public List<Client> fetchClients(){
        return clientService.fetchClients();
    }

    @GetMapping("/{id}")
    public Client fetchClientById(@PathVariable("id") Long id){
        return clientService.fetchClientById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteClientById(@PathVariable("id") Long id){
        clientService.deleteClientById(id);
        return "Client " + id + " deleted successfully";
    }

    @PutMapping("/{id}")
    public Client updateClientById(@PathVariable("id") Long id , @RequestBody Client client){
        return clientService.updateClientById(id, client);
    }

}
