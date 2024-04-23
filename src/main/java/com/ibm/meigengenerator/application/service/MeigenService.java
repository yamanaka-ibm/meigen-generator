package com.ibm.meigengenerator.application.service;

import org.springframework.stereotype.Component;

import com.ibm.meigengenerator.infrastructure.MeigenRepository;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class MeigenService {

    private final MeigenRepository meigenRepository;

    public String getMeigen() {
        return meigenRepository.getMeigen();
    }
}
