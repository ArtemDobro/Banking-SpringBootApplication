package com.andersenlab.rmtbanking.depositservice.controller;

import com.andersenlab.rmtbanking.depositservice.dto.DetailedDepositDto;
import com.andersenlab.rmtbanking.depositservice.service.DepositService;
import com.andersenlab.rmtbanking.depositservice.validation.annotation.Uuid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RequestMapping("/auth/deposits")
@RestController
@RequiredArgsConstructor
public class DepositController {

    private final DepositService depositService;

    @GetMapping("/{agreementId}")
    @ResponseStatus(HttpStatus.OK)
    public DetailedDepositDto getDeposit( @Uuid @PathVariable("agreementId") String agreementId, @Uuid @RequestParam String cardId) {
        return depositService.getDetailedDeposit(agreementId, cardId);
    }
}