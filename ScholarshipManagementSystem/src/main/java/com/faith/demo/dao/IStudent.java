package com.faith.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.faith.demo.entity.Student;

@Repository
public interface IStudent extends CrudRepository<Student, Integer> {

}
