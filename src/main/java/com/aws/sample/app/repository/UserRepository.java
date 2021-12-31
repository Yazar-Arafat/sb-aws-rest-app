package com.aws.sample.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aws.sample.app.model.UserEntity;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, String> {

}
