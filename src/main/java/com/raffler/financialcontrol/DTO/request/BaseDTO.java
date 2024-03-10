package com.raffler.financialcontrol.DTO.request;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public abstract class BaseDTO {
    private Long id;

    @NotEmpty
    private Date date;

    @NotEmpty
    private String description;

    @NotEmpty
    private Double value;

    @NotEmpty
    private String monthYear;
}
