package com.paliwal999harsh.competitivecodehub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.paliwal999harsh.competitivecodehub.service.CodeSubmissionService;

import lombok.Data;

@RestController
@Data
@RequestMapping(value="/api/code/submit")
public class CodeSubmissionController {
    @Autowired
    CodeSubmissionService codeSubmissionService;
    
    @PostMapping(value="/upload/{problemId}")
    public String handleCodeUpload(@PathVariable String problemId, @RequestParam MultipartFile codeFile){
        return codeSubmissionService.handleCodeUpload(problemId, codeFile);
    }   
}
