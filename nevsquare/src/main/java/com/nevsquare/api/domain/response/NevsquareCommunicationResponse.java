package com.nevsquare.api.domain.response;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class NevsquareCommunicationResponse {
    private String description;
    private Integer result;
}
