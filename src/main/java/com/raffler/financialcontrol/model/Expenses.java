package com.raffler.financialcontrol.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "expenses")
public class Expenses implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "month_year_id", nullable = false)
    private String monthYearId;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    @Column(name = "date", nullable = false)
    private Date date;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "value", nullable = false)
    private Double value;

    @Column(name = "type", nullable = false)
    private String type;

    @Column(name = "secundary_type")
    private String secundaryType;

    @Column(name = "portion")
    private String portion;


}