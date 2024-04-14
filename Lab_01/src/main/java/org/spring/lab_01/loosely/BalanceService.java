package org.spring.lab_01.loosely;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;


public class BalanceService
    {
    public boolean check(Balance balance, BigDecimal spend)
        {
        BigDecimal amount=balance.getAmount();
        if (amount.subtract(spend).compareTo(BigDecimal.ZERO)>=0)
            {
            balance.setAmount(amount.subtract(spend));
            return true;
            }
        else
            {
            return false;
            }
        }
    }
