package com.practika.credithistory.repo;


import com.practika.credithistory.entity.Application;
import org.springframework.data.repository.CrudRepository;

public interface ApplicationRepository extends CrudRepository<Application,Long> {
}
