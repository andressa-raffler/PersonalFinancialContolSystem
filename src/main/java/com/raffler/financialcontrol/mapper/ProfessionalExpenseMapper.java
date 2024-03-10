package com.raffler.financialcontrol.mapper;
import com.raffler.financialcontrol.DTO.request.PersonalExpenseDTO;
import com.raffler.financialcontrol.DTO.request.ProfessionalExpenseDTO;
import com.raffler.financialcontrol.model.PersonalExpense;
import com.raffler.financialcontrol.model.ProfessionalExpense;
import org.mapstruct.Mapper;


@Mapper
public interface ProfessionalExpenseMapper extends BaseMapper<ProfessionalExpenseDTO, ProfessionalExpense> {

}
