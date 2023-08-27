package com.paliwal999harsh.competitivecodehub.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.paliwal999harsh.competitivecodehub.model.PlatformModel;
import com.paliwal999harsh.competitivecodehub.service.PlatformService;

import lombok.Data;

@Data
@RestController
@RequestMapping("/api/platform")
public class PlatformController {
    @Autowired
    private PlatformService platformService;

    @GetMapping(value="/getPlatform")
    public PlatformModel getPlatform(@RequestParam String param) {
        return platformService.getPlatform(param);
    }

    @PostMapping(value="/registerPlatform")
    public ResponseEntity<Object> registerPlatform(@RequestBody PlatformModel platformModel){
        platformModel = platformService.savePlatform(platformModel);
        if(platformModel!=null){
            return ResponseEntity.accepted().body(platformModel);
        }
        else{
            return ResponseEntity.badRequest().body("Error Occurred");
        }
    }
}