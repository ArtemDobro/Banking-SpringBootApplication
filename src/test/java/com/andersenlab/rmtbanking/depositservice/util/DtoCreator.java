package com.andersenlab.rmtbanking.depositservice.util;

import com.andersenlab.rmtbanking.depositservice.dto.CardProductDto;
import com.andersenlab.rmtbanking.depositservice.dto.DebitCardsDto;
import com.andersenlab.rmtbanking.depositservice.dto.DebitCardsInfoDto;
import com.andersenlab.rmtbanking.depositservice.dto.DepositDto;
import com.andersenlab.rmtbanking.depositservice.dto.DetailedDepositDto;
import com.andersenlab.rmtbanking.depositservice.dto.SwitcherDto;
import com.andersenlab.rmtbanking.depositservice.entity.enums.CardStatus;
import com.andersenlab.rmtbanking.depositservice.entity.enums.PaymentSystem;
import com.andersenlab.rmtbanking.depositservice.entity.enums.PremiumStatus;
import lombok.experimental.UtilityClass;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;

@UtilityClass
public class DtoCreator {

    public static final String EXAMPLE_UUID = "11111111-1111-1111-1111-1111111111dc";

    public static DebitCardsDto getDebitCardsDto() {
        return new DebitCardsDto(
                "11111111-1111-1111-1111-1111111111dc",
                "BestCard",
                "Mikhail",
                new BigDecimal("5.3"),
                CardStatus.ACTIVE,
                LocalDate.of(2025, Month.APRIL, 5),
                "Egorov",
                true,
                "Yes",
                false);
    }

    public static DebitCardsInfoDto getDebitCardsInfoDto() {
        return new DebitCardsInfoDto("account_number",
                "YES",
                "2222-01-01",
                "9999999",
                "USD",
                "EXPIRED");
    }

    public static DetailedDepositDto getDetailedDepositDto() {
        return new DetailedDepositDto("1234567890123456",
                DateTimeUtil.getDateTime("2022-01-01 10:00", DateTimeUtil.getDefaultFormatter()),
                DateTimeUtil.getDateTime("2028-01-01 10:00", DateTimeUtil.getDefaultFormatter()),
                new BigDecimal("5.3"),
                new BigDecimal("7000000"),
                true,
                "test name",
                "USD",
                "schemaName",
                true,
                true);
    }

    public static SwitcherDto getSwitcherDto() {
        return SwitcherDto.builder()
                .accountId("11111111-1111-1111-1111-1111111111ac")
                .isTurnOn(true)
                .build();
    }

    public static CardProductDto getCardProductDto() {
        return new CardProductDto(1L,
                "card_name",
                PremiumStatus.BLACK,
                PaymentSystem.MASTERCARD,
                BigDecimal.valueOf(3),
                "Mono", false,
                "USD",
                BigDecimal.valueOf(3000),
                BigDecimal.valueOf(5000),
                true,
                12);
    }

    public static DepositDto getDepositDto() {
        return new DepositDto(
                EXAMPLE_UUID,
                DateTimeUtil.getDateTime("2022-01-01 10:00", DateTimeUtil.getDefaultFormatter()),
                DateTimeUtil.getDateTime("2028-01-01 10:00", DateTimeUtil.getDefaultFormatter()),
                BigDecimal.valueOf(9999999),
                "product_name",
                "USD",
                "");
    }
}