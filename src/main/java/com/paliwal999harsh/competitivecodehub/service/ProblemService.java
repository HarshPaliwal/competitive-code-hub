package com.paliwal999harsh.competitivecodehub.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paliwal999harsh.competitivecodehub.model.ProblemModel;
import com.paliwal999harsh.competitivecodehub.repository.ProblemRepository;

import lombok.Data;

/**
 * ProblemService
 */
@Service
@Data
public class ProblemService {
    @Autowired
    private final ProblemRepository problemRepository;
    private final CsesFiService csesFiService;
    public ProblemModel saveProblem(ProblemModel problem){
        return problemRepository.save(problem);
    }
    public String fetchProblems(){
        List<ProblemModel> csesFiProblems = csesFiService.fetchProblems();
        if(csesFiProblems!=null){
            problemRepository.saveAll(csesFiProblems);
            return "CSES FI Problems Fetched.";
        }
        return "Not Fetched";
    }
    public ProblemModel getProblemById(String problemId){
        return problemRepository.getReferenceById(problemId);
    }
}