package com.nevsquare.api.domain.request;

import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Data
@Builder
@Jacksonized
public class NevsquareCommunicationRequest {
    private String username;
    private Integer nr1;
    private Integer nr2;
}
