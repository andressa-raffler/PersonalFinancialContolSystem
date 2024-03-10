package com.raffler.financialcontrol.DTO.request;


import jakarta.validation.constraints.NotEmpty;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProfessionalExpenseDTO extends BaseDTO {


    @NotEmpty
    private String type;

}
