package com.nevsquare.service.web;

import com.nevsquare.api.NevsquareService;
import com.nevsquare.api.domain.request.NevsquareCommunicationRequest;
import com.nevsquare.api.domain.response.NevsquareCommunicationResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NevsquareController implements NevsquareService {

    @Override
    public ResponseEntity<NevsquareCommunicationResponse> communicate(NevsquareCommunicationRequest request) {
        return ResponseEntity.ok(NevsquareCommunicationResponse.builder()
                .description(request.getUsername() + "a fost aici si a facut adunarea " + request.getNr1() + " + " + request.getNr2())
                .result(request.getNr1() + request.getNr2())
                .build());
    }
}
