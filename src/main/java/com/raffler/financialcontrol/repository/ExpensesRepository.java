package com.raffler.financialcontrol.repository;

import com.raffler.financialcontrol.model.Expenses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.Optional;

@Repository
public interface ExpensesRepository  extends JpaRepository<Expenses, Long> {

    Optional<Expenses> findByMonthYearId(Date monthYearId);

}
