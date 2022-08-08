package com.neweramngmnt.neweramanagement.Repository;

import com.neweramngmnt.neweramanagement.Entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
