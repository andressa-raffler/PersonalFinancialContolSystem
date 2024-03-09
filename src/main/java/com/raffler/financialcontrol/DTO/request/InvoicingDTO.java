package com.raffler.financialcontrol.DTO.request;

import jakarta.validation.constraints.NotEmpty;
import lombok.*;
import org.springframework.stereotype.Component;

import java.util.Date;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Component
public class InvoicingDTO {

    private Long id;

    @NotEmpty
    private String monthYearId;

    @NotEmpty
    private Date date;

    @NotEmpty
    private String description;

    @NotEmpty
    private Double value;


}
