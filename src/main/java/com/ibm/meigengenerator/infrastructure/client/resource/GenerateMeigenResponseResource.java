package com.ibm.meigengenerator.infrastructure.client.resource;

import java.util.List;

import lombok.Data;

@Data
public class GenerateMeigenResponseResource {

    private List<GenerateMeigenResponseResultResource> results;
}
