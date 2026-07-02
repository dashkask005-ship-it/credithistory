package com.practika.credithistory.repo;


import com.practika.credithistory.entity.Application;
import com.practika.credithistory.entity.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<Client,Long> {
}
