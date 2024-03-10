package com.raffler.financialcontrol.repository;


import com.raffler.financialcontrol.model.Variable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VariablesRepository extends JpaRepository<Variable, Long> {

}
