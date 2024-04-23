package com.ibm.meigengenerator.presentation;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.meigengenerator.application.service.MeigenService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class MeigenController {

    private final MeigenService meigenService;

    @RequestMapping(value = "/meigen") 
    public String getMeigen() {
        return meigenService.getMeigen();
    }
}
