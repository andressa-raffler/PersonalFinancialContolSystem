package com.raffler.financialcontrol.repository;



import com.raffler.financialcontrol.model.PersonalExpense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonalExpenseRepository extends JpaRepository<PersonalExpense, Long> {

}
