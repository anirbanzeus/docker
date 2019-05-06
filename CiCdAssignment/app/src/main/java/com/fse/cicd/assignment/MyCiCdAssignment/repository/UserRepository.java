package com.fse.cicd.assignment.MyCiCdAssignment.repository;

import org.springframework.data.repository.CrudRepository;

import com.fse.cicd.assignment.MyCiCdAssignment.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
