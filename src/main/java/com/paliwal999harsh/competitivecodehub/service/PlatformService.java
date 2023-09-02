package com.paliwal999harsh.competitivecodehub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paliwal999harsh.competitivecodehub.model.PlatformModel;
import com.paliwal999harsh.competitivecodehub.repository.PlatformRepository;

@Service
public class PlatformService{

    @Autowired
    private PlatformRepository platformRepository;
    
    public PlatformModel savePlatform(PlatformModel platformModel) {
        return platformRepository.save(platformModel);
    }
    public PlatformModel getPlatform(String id){
        return platformRepository.getReferenceById(id);
    }

}
