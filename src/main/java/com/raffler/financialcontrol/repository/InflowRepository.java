package com.raffler.financialcontrol.repository;


import com.raffler.financialcontrol.model.BaseEntity;
import com.raffler.financialcontrol.model.Inflow;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface InflowRepository extends JpaRepository<BaseEntity, Long>, BaseRepository<Inflow, Long> {

    List<Inflow> findByMonthYear(String monthYear);


}
