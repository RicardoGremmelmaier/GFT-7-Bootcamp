package com.jdbc.persistence.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.time.OffsetDateTime;


@Data
public class EmployeeEntity {
    private long Id;
    private String name;
    private OffsetDateTime birthday;
    private BigDecimal salary;
}
