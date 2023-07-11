package com.nevsquare.api;

import com.nevsquare.api.domain.request.NevsquareCommunicationRequest;
import com.nevsquare.api.domain.response.NevsquareCommunicationResponse;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@Validated
public interface NevsquareService {

    @PostMapping(value = "/api/nevsquare/communicate",
            consumes = "application/json",
            produces = "application/json")
    ResponseEntity<NevsquareCommunicationResponse> communicate(@Valid @RequestBody NevsquareCommunicationRequest request);
    @GetMapping("/hello")
    public String hello();
}
