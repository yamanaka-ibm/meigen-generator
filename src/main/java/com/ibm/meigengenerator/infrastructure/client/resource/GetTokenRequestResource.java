package com.ibm.meigengenerator.infrastructure.client.resource;

import org.springframework.util.MultiValueMap;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Builder
@Data
public class GetTokenRequestResource {

    private final String apikey;

    @JsonProperty("grant_type")
    private final String grantType = "urn:ibm:params:oauth:grant-type:apikey";

    public static GetTokenRequestResource init(String apikey) {
        return GetTokenRequestResource.builder()
            .apikey(apikey)
            .build();
    } 
    
    public MultiValueMap<String, String> toMultiValueMap() {
        MultiValueMap<String, String> map = new org.springframework.util.LinkedMultiValueMap<>();
        map.add("apikey", apikey);
        map.add("grant_type", grantType);
        return map;
    }
}


