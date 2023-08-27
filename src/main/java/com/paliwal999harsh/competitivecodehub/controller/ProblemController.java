package com.paliwal999harsh.competitivecodehub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paliwal999harsh.competitivecodehub.model.ProblemModel;
import com.paliwal999harsh.competitivecodehub.service.ProblemService;

import lombok.Data;

/**
 * ProblemController
 */
@Data
@RestController
@RequestMapping(value="/api/problem")
public class ProblemController {
    @Autowired
    ProblemService problemService;

    @GetMapping(value="/getProblems")
    public String getProblems(){
        return problemService.fetchProblems();
    }
    @GetMapping(value="/getProblem/{problemId}")
    public ResponseEntity<ProblemModel> getProblem(@PathVariable String problemId){
        ProblemModel problem  = problemService.getProblemById(problemId);
        if(problem!=null){
            return ResponseEntity.ok(problem);
        }
        else{
            return ResponseEntity.notFound().build();
        }
    } 
}