package com.ibm.meigengenerator.infrastructure;

import org.springframework.stereotype.Component;

import com.ibm.meigengenerator.infrastructure.client.GenerativeClient;
import com.ibm.meigengenerator.infrastructure.client.TokenClient;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public class MeigenRepository {

    private final TokenClient tokenClient;

    private final GenerativeClient generativeClient;

    public String getMeigen() {
        return generativeClient.generateMeigen(tokenClient.getToken());
    }

}
