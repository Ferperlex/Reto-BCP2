package com.example.retobcp1;
import org.springframework.data.repository.CrudRepository;

public interface DineroRepository extends CrudRepository<Dinero, Integer> {

    Dinero findDineroById(Integer id);
}