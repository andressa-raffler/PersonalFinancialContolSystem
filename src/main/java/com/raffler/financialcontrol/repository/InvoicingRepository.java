package com.raffler.financialcontrol.repository;

import com.raffler.financialcontrol.model.Invoicing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.Optional;

@Repository
public interface InvoicingRepository extends JpaRepository<Invoicing, Long> {
    Optional<Invoicing> findByMonthYearId(Date monthYearId);

}
