package com.ibm.meigengenerator.infrastructure.client.resource;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@Builder
public class GenerateMeigenRequestBody {

    @JsonProperty("decoding_method")
    private final String decodingMethod;

    @JsonProperty("max_new_tokens")
    private final int maxNewTokens;

    @JsonProperty("min_new_tokens")
    private final int minNewTokens;

    @JsonProperty("repetition_penalty")
    private final double repetionPenalty;

    @JsonProperty("top_k")
    private final int topK;

    @JsonProperty("top_p")
    private final int topP;

    @JsonProperty("temperature")
    private final double temperature;

    public static GenerateMeigenRequestBody init() {
        return GenerateMeigenRequestBody.builder()
            .decodingMethod("sample")
            .maxNewTokens(500)
            .minNewTokens(100)
            .repetionPenalty(1)
            .topK(50)
            .topP(1)
            .temperature(0.7)
            .build();
    }
}
