package com.raffler.financialcontrol.repository;

import com.raffler.financialcontrol.model.Eventual;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventualRepository extends JpaRepository<Eventual, Long>, BaseRepository<Eventual, Long> {

}
