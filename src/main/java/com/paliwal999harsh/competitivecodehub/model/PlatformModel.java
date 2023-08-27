package com.paliwal999harsh.competitivecodehub.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class PlatformModel {
    @Id
    private String platformId;
    String platformName;
    private String platformBaseURL; 
}
