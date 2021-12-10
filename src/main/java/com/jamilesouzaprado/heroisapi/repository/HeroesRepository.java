package com.jamilesouzaprado.heroisapi.repository;

import com.jamilesouzaprado.heroisapi.document.Heroes;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

@EnableScan

public interface HeroesRepository extends CrudRepository<Heroes, String>{

}
