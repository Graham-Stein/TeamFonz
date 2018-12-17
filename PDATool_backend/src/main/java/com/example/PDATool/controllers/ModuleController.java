package com.example.PDATool.controllers;

import com.example.PDATool.interfaces.IModule;
import com.example.PDATool.models.Answer;
import com.example.PDATool.repository.answers.AnswerRepository;
import com.example.PDATool.repository.questions.QuestionRepository;
import com.example.PDATool.repository.students.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping(value="/modules")

public class ModuleController {

  @Autowired
  AnswerRepository answerRepository;

  @Autowired
  QuestionRepository questionRepository;

  @Autowired
  StudentRepository studentRepository;


    //create a route to get module to front end.
    //student ID present a list of mo

  @GetMapping(value = "/{student_id}/")
  public List<IModule> getAllModulesforStudent(@PathVariable Long student_id){

      return

  }





    @Transactional
}
