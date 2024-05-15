package com.ibm.meigengenerator.infrastructure.client.resource;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@Builder
public class GenerateMeigenRequestResource {

    @JsonProperty("parameters")
    private final GenerateMeigenRequestBody requestBody;

    @JsonProperty("project_id")
    private final String projectId;

    @JsonProperty("model_id")
    private final String modelId;

    private final String input;

    public static GenerateMeigenRequestResource init(String projectId) {
        System.out.print(projectId);

        return GenerateMeigenRequestResource
                .builder()
                .requestBody(GenerateMeigenRequestBody.init())
                .projectId(projectId)
                .modelId("mistralai/mixtral-8x7b-instruct-v01")
                .input(
                        "<s>[INST] あなたは人の心に響く名言を考えるプロです。\n" + //
                                "以下のような名言をあなたは考えました。[/INST]\n" + //
                                "- いつか、必ず、チャンスの順番が来ると信じなさい\n" + //
                                "- きみはこれからも何度もつまづく。でもそのたびに立ち直る強さももってるんだよ\n" + //
                                "</s>\n" + //
                                "[INST] 人の心に響く名言を200文字以内で1件のみ日本語で生成してください。 [/INST]\n")
                .build();
    }
}
