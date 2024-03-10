package com.raffler.financialcontrol.DTO.request;


import lombok.*;

import jakarta.validation.constraints.NotEmpty;
import java.util.Date;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonalExpenseDTO extends BaseDTO {


    @NotEmpty
    private String type;

}
