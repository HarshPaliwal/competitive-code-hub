package com.paliwal999harsh.competitivecodehub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paliwal999harsh.competitivecodehub.model.ProblemModel;

public interface ProblemRepository extends JpaRepository<ProblemModel,String> {
    
}
