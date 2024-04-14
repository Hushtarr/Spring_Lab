package org.spring.lab_01.loosely;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;
@Getter
@Setter

public class CustomerBalance extends Balance
    {

    public CustomerBalance(UUID userId, BigDecimal amount)
        {
        super(userId, amount);
        }

    @Override
    public void addBalance(BigDecimal amount)
        {
        setAmount(this.getAmount().add(amount));
        }
    }
