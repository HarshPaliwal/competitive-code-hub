package com.paliwal999harsh.competitivecodehub.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ProblemModel
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProblemModel {
    @Id
    String problemId;
    String problemName;
    String problemCategory;   
    @ManyToOne
    PlatformModel platformModel; 
    String problemURI;
}