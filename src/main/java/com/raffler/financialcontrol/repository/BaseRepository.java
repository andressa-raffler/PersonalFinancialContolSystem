package com.raffler.financialcontrol.repository;

import com.raffler.financialcontrol.model.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;

@NoRepositoryBean
public interface BaseRepository<T extends BaseEntity, ID> extends JpaRepository<T, ID> {
    List<T> findByMonthYear(String monthYear);
}