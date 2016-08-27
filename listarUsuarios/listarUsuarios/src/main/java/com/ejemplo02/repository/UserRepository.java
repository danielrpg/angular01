package com.ejemplo02.repository;

import org.springframework.data.repository.CrudRepository;

import com.ejemplo02.domain.User;

public interface UserRepository extends CrudRepository<User, Integer>{

}
