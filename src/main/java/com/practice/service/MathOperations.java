package com.practice.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Slf4j
@Service
public class MathOperations {

    public BigDecimal add(BigDecimal... nums) {
        verifyRequiredNumsByLength(nums);

        BigDecimal base = BigDecimal.ZERO;
        for (BigDecimal num : nums) {
            base = base.add(num);
        }

        return base;
    }


    public BigDecimal subtract(BigDecimal base, BigDecimal... nums) {
        verifyRequiredNumsByLength(nums);

        for (BigDecimal num : nums) {
            base = base.subtract(num);
        }

        return base;
    }

    public BigDecimal multiply(BigDecimal base, BigDecimal... nums) {
        verifyRequiredNumsByLength(nums);

        if(base.compareTo(BigDecimal.ZERO) == 0) {
            return base;
        }

        for (BigDecimal num : nums) {
            base = base.multiply(num);
        }

        return base;
    }

    public BigDecimal divide(BigDecimal base, BigDecimal... nums) {
        verifyRequiredNumsByLength(nums);

        if(base.compareTo(BigDecimal.ZERO) == 0) {
            return base;
        }

        for (BigDecimal num : nums) {
            if(num.compareTo(BigDecimal.ZERO) == 0) {
                throw new ArithmeticException("Can't divide by zero!");
            }
            base = base.divide(num, 2, RoundingMode.CEILING);
        }

        return base;
    }


    private void verifyRequiredNumsByLength(BigDecimal[] nums) {
        if(nums.length == 0) {
            throw new IllegalArgumentException("At least one number must be exist!");
        }
    }

}
