package org.spring.lab_02.account;

import lombok.Getter;
import lombok.Setter;
import org.spring.lab_02.Currency;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
public class Saving {

    private Currency currency;
    private BigDecimal amount;
    private UUID accountId;

    public void initialize() {
        System.out.println("savings account " + "currency: " + currency.getCode() + ", amount: " + amount + ", accountId: " + accountId);
    }
}
