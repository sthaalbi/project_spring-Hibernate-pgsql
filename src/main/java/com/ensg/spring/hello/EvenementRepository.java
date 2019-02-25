package com.ensg.spring.hello;

import org.springframework.data.repository.CrudRepository;

public interface EvenementRepository extends CrudRepository<Evenement, Integer> {
}
