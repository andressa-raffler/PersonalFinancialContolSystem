package com.raffler.financialcontrol.mapper;
import com.raffler.financialcontrol.DTO.request.ObjectivesDTO;
import com.raffler.financialcontrol.DTO.request.PersonalExpenseDTO;
import com.raffler.financialcontrol.model.Objectives;
import com.raffler.financialcontrol.model.PersonalExpense;
import org.mapstruct.Mapper;


@Mapper
public interface PersonalExpenseMapper extends BaseMapper<PersonalExpenseDTO, PersonalExpense> {

}
