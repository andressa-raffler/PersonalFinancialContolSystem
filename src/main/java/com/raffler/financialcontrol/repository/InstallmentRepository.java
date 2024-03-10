package com.raffler.financialcontrol.repository;


import com.raffler.financialcontrol.model.BaseEntity;
import com.raffler.financialcontrol.model.Installment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstallmentRepository extends JpaRepository<Installment, Long> {

}
