package com.ibm.meigengenerator.infrastructure.client.resource;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class GetTokenResponseResource {

    @JsonProperty("access_token")
    private String accessToken;
}
