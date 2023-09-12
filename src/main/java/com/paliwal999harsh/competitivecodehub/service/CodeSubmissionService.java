package com.paliwal999harsh.competitivecodehub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.paliwal999harsh.competitivecodehub.model.ProblemModel;

import lombok.Data;

@Service
@Data
public class CodeSubmissionService{
    @Autowired
    ProblemService problemService;
    
        public String handleCodeUpload(String problemId, MultipartFile codeFile){
        ProblemModel problem = problemService.getProblemById(problemId);
        
        return "OK";
    }
}
