package com.ibm.meigengenerator.infrastructure.client.resource;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class GenerateMeigenResponseResultResource {

    @JsonProperty("generated_text")
    private String generatedText;
}
