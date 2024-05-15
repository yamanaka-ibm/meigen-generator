package com.ibm.meigengenerator.infrastructure.client;

import com.ibm.meigengenerator.infrastructure.client.resource.GenerateMeigenRequestResource;
import com.ibm.meigengenerator.infrastructure.client.resource.GenerateMeigenResponseResource;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@RequiredArgsConstructor
public class GenerativeClient {

    private static final String ENDPOINT = "https://us-south.ml.cloud.ibm.com/ml/v1-beta/generation/text?version=2023-05-29";

    private final RestTemplate restTemplate;

    @Value("${app.project.id}")
    private String appProjectId;

    public String generateMeigen(String accessToken) {
        return restTemplate
                .exchange(
                        RequestEntity
                                .post(ENDPOINT)
                                .header("Authorization", "Bearer " + accessToken)
                                .header("content-type", "application/json")
                                .header("accept", "application/json")
                                .contentType(MediaType.APPLICATION_JSON)
                                .body(GenerateMeigenRequestResource.init(appProjectId)),
                        GenerateMeigenResponseResource.class)
                .getBody()
                .getResults()
                .get(0)
                .getGeneratedText();
    }
}
