package com.paliwal999harsh.competitivecodehub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.paliwal999harsh.competitivecodehub.model.PlatformModel;

public interface PlatformRepository extends JpaRepository<PlatformModel,String> {
    @Query("SELECT p FROM PlatformModel p WHERE p.platformId = ?1")
    PlatformModel getPlatformById(String id);
}
