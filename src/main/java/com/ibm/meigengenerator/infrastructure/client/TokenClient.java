package com.ibm.meigengenerator.infrastructure.client;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.ibm.meigengenerator.infrastructure.client.resource.GetTokenRequestResource;
import com.ibm.meigengenerator.infrastructure.client.resource.GetTokenResponseResource;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class TokenClient {

    private final static String TOKEN_ENDPOINT = "https://iam.cloud.ibm.com/identity/token";

    private final RestTemplate restTemplate;

    @Value("${app.api.key}")
    private String apikey;

    public String getToken() {
        return restTemplate.exchange(
                RequestEntity.post(
                    TOKEN_ENDPOINT
                )
                .contentType(MediaType.APPLICATION_FORM_URLENCODED)
                .header("Content-Type", "application/x-www-form-urlencoded")
                .header("Accept", "application/json")
                .body(GetTokenRequestResource.init(apikey).toMultiValueMap()),
            GetTokenResponseResource.class
            )
            .getBody()
            .getAccessToken();
    }
}
