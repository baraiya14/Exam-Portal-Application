package com.MainApp.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.MainApp.Pojo.Question;
@Repository
public interface QuestionRepo extends CrudRepository<Question, String> {

}
